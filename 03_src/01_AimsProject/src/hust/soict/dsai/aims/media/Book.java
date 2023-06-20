package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(String title, float cost) {
		this.setTitle(title);
		this.setCost(cost);
	}
	public Book(String title, String category, int id, float cost) {
		super(title,category,id,cost);
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
	public ArrayList<String> getAuthors(){
		return this.authors;
	}
	
	public String toString() {
		String book_string = "Book" + " - " + this.getTitle() + " - " + this.getCategory() +" - "
				+ this.getCategory() + " - " + this.getAuthors() + ": " + this.getCost() + " $" ;
		return book_string;
	}
}
