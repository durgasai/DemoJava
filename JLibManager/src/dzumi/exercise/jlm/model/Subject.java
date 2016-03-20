package dzumi.exercise.jlm.model;

public class Subject {
	int id;
	String title;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%1$d\t%2$s", id, title);
	}
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	
	public Subject(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
