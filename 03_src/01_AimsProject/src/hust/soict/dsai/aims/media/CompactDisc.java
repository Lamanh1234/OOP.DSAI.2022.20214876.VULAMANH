package hust.soict.dsai.aims.media;
import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable{
	private String Artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		// TODO Auto-generated constructor stub
		super();
	}

	public CompactDisc(String title, String category, String artist, float cost) {
		// TODO Auto-generated constructor stub
		super(title,category,cost);
		this.Artist = artist;
		
	}

	public String getArtist() {
		return Artist;
	}
	
	public void addTrack(Track track) {
		if (this.tracks.contains(track)) {
			System.out.println("Track is already in the list of tracks");
		} else {
			this.tracks.add(track);
			System.out.println("Add successfully");
		}
	}
	
	public void removeTrack(Track track) {
		boolean change = tracks.remove(track);
		if (change) {
			System.out.println("Remove successfully");
		} else {
			System.out.println("Track is not found in list of tracks");
		}
	}
	
	public int getLength() {
		int totalLen = 0;
		for (Track track: tracks) {
			totalLen += track.getLength();
		}
		return totalLen;
	}
	
	// play implement:
	public void play() {
		for (int i = 0; i < tracks.size(); i++) {
			System.out.println("Track " + (i+1) + ":");
			tracks.get(i).play();
			System.out.println("*********************");
		}
	}
	
	//toString
	public String toString() {
		String cd_string = "CD" + " - " + this.getTitle() + " - " + this.getCategory() +" - "
				+ this.getCategory() + " - " + this.getLength()+ " - " + this.getArtist()+ this.getTracks() + ": " + this.getCost() + " $" ;
		return cd_string;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}



}
