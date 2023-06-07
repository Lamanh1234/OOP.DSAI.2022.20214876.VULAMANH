package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	
	// Classifier Member:
	private static int nbDigitalVideoDiscs = 0;
	
	//Constructor by title
	public DigitalVideoDisc(String title){
		this.title = title;
		update_id();
	}
	
	//Constructor by category, title and cost
	public DigitalVideoDisc(String title, String category, float cost){
		this.category = category;
		this.title = title;
		this.cost = cost;
		update_id();
	}
	
	// Constructor by director, category, title and cost
	
	DigitalVideoDisc(String director, String category, String title, float cost){
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		update_id();
	}
	// Constructor by title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director,
			int length, float cost){
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		update_id();
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
	private void update_id() {
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	public int getId() {
		return this.id;
	}

	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}
	public String toString() {
		 String dvd_string = "DVD" + " - " + this.getTitle() + " - " + this.getCategory() +" - "
				+ this.getDirector() + " - " + this.getLength()+": " + this.getCost() + " $";
		 return dvd_string;
	}
}
