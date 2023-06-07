package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class Book {
	private int id;
	private String title;
	private String category;
	private float cost;
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("Author is already in list of authors");
		} else {
			authors.add(authorName);
			System.out.println("Add authors successfully");
		}
	}
	
	public void removeAuthor(String authorName) {
		boolean change = authors.remove(authorName);
		if (change) {
			System.out.println("Remove author successfully");
		} else {
			System.out.println("Author is not found in list of authors");
		}
	}
}
