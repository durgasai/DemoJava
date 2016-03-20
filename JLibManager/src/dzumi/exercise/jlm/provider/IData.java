package dzumi.exercise.jlm.provider;

import java.util.HashMap;
import java.util.List;

import dzumi.exercise.jlm.model.Book;
import dzumi.exercise.jlm.model.Subject;

public interface IData {
	void loadData(HashMap<Integer, List<Book>> data, List<Subject> listSubjects);
	List<Book> searchByTitle(String title);
	List<Book> searchByAuthor(String author);
	List<Book> searchByPublisher(String pub);
	List<Book> search(String text);
	
	int insertBook(Book book);
	
	
}
