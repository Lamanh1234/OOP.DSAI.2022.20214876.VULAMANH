package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

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
	public void play() throws PlayerException{
        if (getLength() > 0) {
            System.out.println("Playing Track: " + getTitle());
        System.out.println("Track length: " + getLength());
        } else {
            throw new PlayerException("Track length is non-postive");
        }
        
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
