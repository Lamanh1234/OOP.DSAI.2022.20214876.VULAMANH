package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	//Constructor by title
	DigitalVideoDisc(String title){
		this.title = title;
	}
	
	//Constructor by category, title and cost
	public DigitalVideoDisc(String category, String title, float cost){
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	
	// Constructor by director, category, title and cost
	
	DigitalVideoDisc(String director, String category, String title, float cost){
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	// Constructor by title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director,
			int length, float cost){
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
}
