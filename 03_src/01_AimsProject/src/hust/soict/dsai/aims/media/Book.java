package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(String title, float cost) {
		this.setTitle(title);
		this.setCost(cost);
	}
	public Book(String title, String category, int id, float cost) {
		super(title,category,id,cost);
	}
	public void addAuthor(String author) throws IllegalArgumentException {
        if (!authors.contains(author)) {
            authors.add(author);
            System.out.println("Added author: " + author);
        } else {
            throw new IllegalArgumentException(author + " is already in the list of authors.");
        }
    }

    public void removeAuthor(String author) throws NoSuchElementException {
        if (authors.contains(author)) {
            authors.remove(author);
            System.out.println("Removed author: " + author);
        } else {
            throw new NoSuchElementException(author + " is not in the list of authors.");
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
