package dzumi.exercise.jlm.provider;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListResourceBundle;

import dzumi.exercise.jlm.model.Book;
import dzumi.exercise.jlm.model.Subject;
import dzumi.lib.io.IOUtils;

public class DataProvider implements IData{
	HashMap<Integer, List<Book>> data;
	List<Subject> listSubjects;
	int maxID;
	@Override
	public void loadData(HashMap<Integer, List<Book>> data, List<Subject> listSubjects) {
		// TODO Auto-generated method stub
		this.data = data;
		this.listSubjects = listSubjects;
		
		File file = new File("./data/subjects");
//		listSubjects = new ArrayList<>();
		
		//doc file subject
		List<String> subjectContents = IOUtils.readTextFileReturnArrayString(file.getPath());
		Subject subject = null;
		for(String s : subjectContents){
			String temp[] = s.split("\t");
			subject = new Subject(Integer.parseInt(temp[0]), temp[1]);
			listSubjects.add(subject);
		}
		
		//doc file  books
		file = new File("./data/books");
//		data = new HashMap<>();
		List<String> bookContents = IOUtils.readTextFileReturnArrayString(file.getPath());
		List<Book> books = null;
		Book book = null;
		int subjectID = 0;
		for(String s: bookContents){
			String temp[] = s.split("\t");
			int sID = Integer.parseInt(temp[0]);
			if(subjectID != sID){
				subjectID = sID;
				books = new ArrayList<>();
				data.put(subjectID, books);
			}
			book = new Book(subjectID, Integer.parseInt(temp[1]), temp[2], temp[3], temp[4], temp[5]);
			if(maxID < book.getIsbn())
				maxID = book.getIsbn();
			books.add(book);
		}
	}
	@Override
	public List<Book> searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> searchByPublisher(String pub) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> search(String text) {
		// TODO Auto-generated method stub
		return get(text);
	}
	private List<Book> get(String text){
		List<Book> books = new ArrayList<>();
		for(Integer key : data.keySet()){
			List<Book> temp = data.get(key);
			for(Book book : temp){
				if(book.getPublisher().contains(text) || book.getTitle().contains(text) || book.getAuthor().contains(text)){
					books.add(book);
				}
			}
		}
		return books;
	}
	@Override
	public int insertBook(Book book) {
		// TODO Auto-generated method stub
		book.setIsbn(++maxID);
		try{
			IOUtils.expendTextFile("./data/books", book.getContentValues());
		}catch(Exception exception){
			return -1;
		}
		return maxID;
	}
}
