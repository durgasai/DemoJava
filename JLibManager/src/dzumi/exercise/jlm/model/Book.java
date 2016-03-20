package dzumi.exercise.jlm.model;

public class Book {
	int isbn;
	private int subjectID;
	String title;
	String author;
	String publisher;
	String paperback;//so trang
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return String.format("%1$d\t%2$s\t%3$s\t%4$s\t%5$s", isbn, title, author, publisher, paperback);
		return String.format("%-8s%-70s%-20s%-20s%-10s", isbn, title, author, publisher, paperback);
	}
	
	public static String getTitleDisplay(){
//		return String.format("%1$s\t%2$s\t%3$s\t%4$s\t%5$s", "isbn", "title", "author", "publisher", "paperback");
		return String.format("%-8s%-70s%-20s%-20s%-10s", "isbn", "title", "author", "publisher", "paperback");
	}
	
	public String getContentValues(){
		return String.format("%d\t%d\t%s\t%s\t%s\t%s",subjectID, isbn, title, author, publisher, paperback);
	}
	public Book() {
		// TODO Auto-generated constructor stub1
	}
	
	public Book(int subjectID, int isbn, String title, String author, String publisher, String paperback) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.paperback = paperback;
		this.subjectID = subjectID;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPaperback() {
		return paperback;
	}
	public void setPaperback(String paperback) {
		this.paperback = paperback;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
}
