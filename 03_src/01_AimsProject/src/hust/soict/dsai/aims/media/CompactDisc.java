package hust.soict.dsai.aims.media;
import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import hust.soict.dsai.aims.exception.PlayerException;


public class CompactDisc extends Disc implements Playable{
	private String Artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public CompactDisc(String title, float cost) {
		this.setTitle(title);
		this.setCost(cost);
	}

	public CompactDisc(String title,String director, int length, String category, String artist, float cost) {
		// TODO Auto-generated constructor stub
		super(title,category,cost,length, director);
		this.Artist = artist;
		
	}

	public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist2,
			List<Track> tracks2) {
		super(title,category,cost,length,director);
		this.setId(id);
		this.setArtist(artist2);
		this.setTracks(tracks);
		
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
		return Artist;
	}
	
	 public void addtrack(Track track) throws IllegalArgumentException {
	        if (!tracks.contains(track)) {
	            tracks.add(track);
	            System.out.println("Added track: " + track.getTitle());
	        } else {
	            throw new IllegalArgumentException(track.getTitle() + " is already in the list of tracks.");
	        }
	    }

	    public void removetrack(Track track) throws NoSuchElementException {
	        if (tracks.contains(track)) {
	            tracks.remove(track);
	            System.out.println("Removed track: " + track.getTitle());
	        } else {
	            throw new NoSuchElementException(track.getTitle() + " is not in the list of tracks.");
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
	public void play() throws PlayerException {
        if (getLength() > 0) {
            Iterator<Track> iter = tracks.iterator();
            Track nextTrack;
            while (iter.hasNext()) {
                nextTrack = (Track) iter.next();
                try {
                    nextTrack.play();
                } catch (PlayerException e) {
                    throw new PlayerException("Error playing track: " + nextTrack.getTitle(),e);
                }
            }
        } else {
            throw new PlayerException("CD length is non-positive");
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
	
	public void setArtist(String artist) {
		this.Artist = artist;
	}
	
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}



}
