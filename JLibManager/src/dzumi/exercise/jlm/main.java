package dzumi.exercise.jlm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dzumi.exercise.jlm.model.Book;
import dzumi.exercise.jlm.model.Subject;
import dzumi.exercise.jlm.provider.DataProvider;

public class main {
	List<Subject> mSubjects;
	HashMap<Integer, List<Book>> mData;
	private DataProvider mDataProvider;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main jlm = new main();
		
		jlm.excute();
	}
	
	/*static void convert(){
		String utf = "Xin chào thư viện quản lý ứng dụng";
		byte[] data;
		try {
			data = utf.getBytes("UTF-8");
			String ascii = new String(data);
			System.out.println(ascii);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	/*=======================khởi tạo dữ liệu và thực thi chương trình==========================*/
	void excute(){
		printTitle("ỨNG DỤNG QUẢN LÝ THƯ VIỆN JLM");
		int index = 0;
		do{
			initData();
			printMenu();
			String input = readInput("Nhập lựa chọn: ");
			try{
				index = Integer.parseInt(input);
			}catch(NumberFormatException exception){
				print("Giá trị nhập không đúng định dạng.");
				index = 0;
			}
			switchFunction(index);
		}while(index != 4);
		printTitle("Xin chào và hẹn gặp lại");
	}
	
	void switchFunction(int index){
		switch (index) {
		case 1: //liet ke chu de
			showListSubject();
			break;
		case 2: //tim kiem
			showResultSearchBook();	
			break;
		case 3: //liet ke chu de
			insertBook();
			break;
		default:
			break;
		}
	}
	void initData(){
		mDataProvider = new DataProvider();
		mData = new HashMap<>();
		mSubjects = new ArrayList<>();
		mDataProvider.loadData(mData, mSubjects);
	}
	/*=================Chức năng 1: xem danh sách===========================*/

	void showListSubject(){
		print("----------------------------");
		printTitle("Danh mục thể loại");
		printTitle("id\tTên thể loại");
		for(Subject subject : mSubjects){
			print(subject.toString());
		}
		int index = 0;
		do{
			print("----------------------------");
			print("Nhập mã thể loại để xem thông tin.");
			print("Nhập 0 để thoát.");
			String input = readInput("Nhập lựa chọn: ");
			try{
				index = Integer.parseInt(input);
				if(index == 0)
					return;
				List<Book> books = mData.get(index);
				if(books != null){
					showListBooks(books);
				}else
				{
					printTitle("Mã thể loại không tồn tại hoặc không tìm thấy sách trong mã này");
				}
			}catch(NumberFormatException exception){
				print("Giá trị nhập không đúng định dạng.");
				index = 0;
			}
		}while(index != 0);
	}
	
	void showListBooks(List<Book> books){
		print("----------------------------");
		printTitle("Danh mục sách");
		if(books.isEmpty())
			print("Sách không tồn tại");
		printTitle(Book.getTitleDisplay());
		for(Book book : books)
			print(book.toString());
	}
	/*=================Chức năng 2: tìm kiếm sách===========================================*/
	void showResultSearchBook(){
		print("----------------------------");
		String input = "-1";
		do{
			print("Nhập -1 để thoát.");
			input = readInput("Nhập từ khóa tìm kiếm: ");
			if(input.equals("-1"))
				return;
			showListBooks(mDataProvider.search(input));
		}while(true);
	}
	
	/*=================Chức năng 3: thêm sách===========================================*/
	void insertBook(){
		print("----------------------------");
		printTitle("Danh mục thể loại");
		printTitle("id\tTên thể loại");
		for(Subject subject : mSubjects){
			print(subject.toString());
		}
		String inputTitle = readInput("Nhập tên sách: ");
		String inputPub = readInput("Nhập tên nhà xuất bản: ");
		String inputAuthor = readInput("Nhập tên tác giả: ");
		String inputPaperback = readInput("Nhập số lượng trang: ");
		String inputSubjectID = readInput("Nhập mã thể loại: ");
		
		Book book = new Book(Integer.parseInt(inputSubjectID), 0, inputTitle, inputAuthor, inputPub, inputPaperback);
		if(mDataProvider.insertBook(book) != -1){
			print("Thêm thành công");
		}

	}
	/*=============================================================*/

	String readInput(String title){
		System.out.print(title);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		try{   
			s = br.readLine();
		}catch( IOException e){
			e.printStackTrace();
		}
		return s;
	}

	/*=============================================================*/
	void printSubMenu(int menu){
		switch (menu) {
		case 2://xem thông tin sách
			print("Nhập id sách: ");
			break;
		case 3://tìm kiếm
			print("Nhập tên sách cần tìm kiếm");
			break;
		case 4:

			break;
		default:
			break;
		}
	}

	void printMenu(){
		print("==============================");
		print("Nhập 1 để xem danh mục sách");
		print("Nhập 2 để tìm kiếm sách");
		print("Nhập 3 để thêm sách");
		print("Nhập 4 để thoát");
	}

	void printTitle(String title){
		System.err.println(title);
	}

	void print(String text)
	{
		System.out.println(text);
	}
}
