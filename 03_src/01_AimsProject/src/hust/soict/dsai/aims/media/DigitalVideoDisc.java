package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	// Classifier Member:
	private static int nbDigitalVideoDiscs = 0;
	
	//Constructor by category, title and cost
	public DigitalVideoDisc(String title, String category, float cost){
		super(title,category,cost);
		update_id();
	}
	
	// Constructor by director, category, title and cost
	
	DigitalVideoDisc(String director, String category, String title, float cost){
		super(title,category,cost,director);
		update_id();
	}
	// Constructor by title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director,
			int length, float cost){
		super(title,category, cost,length,director);
		update_id();
	}
	
	private void update_id() {
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	public String toString() {
		 String dvd_string = "DVD" + " - " + this.getTitle() + " - " + this.getCategory() +" - "
				+ this.getCategory() + " - " + this.getLength()+": " + this.getCost() + " $";
		 return dvd_string;
	}
	
	// Play implementation:
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
