package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Store {
	public static final int MAX_NUMBERS_DVD = 100;
	ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		itemsInStore.add(media);
	}
	
	public void removeMedia(Media media) {
		boolean change = itemsInStore.remove(media);
		if (change) {
			System.out.println("Remove successfully");
		} else {
			System.out.println("This item is not found in store");
		}
	}
	
	public void listItems() {
		System.out.println("List of item: ");
		for (Media m: itemsInStore) {
			System.out.println(m.toString());
		}
		System.out.println("-----------------------");
	}
	
	public Media searchMedia(String title) {
		for (Media m : itemsInStore) {
			if (m.getTitle().equals(title)) {
				return m;
			}
		}
		return null;
	}
}
