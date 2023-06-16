package hust.soict.dsai.aims.media;

public class Track implements Playable {

	private String title;
	private int length;
	public Track() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	// Implement play:
	public void play() {
		System.out.println("Playing track: " + this.title);
		System.out.println("Track length: " + this.length);
	}
	
	public boolean equal(Object o) {
		Track t = (Track) o;
		if (t.getTitle() == this.title && t.getLength() == this.length) {
			return true;
		} else {
			return false;
		}
	}

}
