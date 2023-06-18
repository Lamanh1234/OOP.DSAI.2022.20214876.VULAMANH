package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import java.util.ArrayList;
import  hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERS = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			System.out.println("Already in list");
		} else {
			itemsOrdered.add(media);
		}
	}
	
	public void removeMedia(Media media) {
		boolean change = itemsOrdered.remove(media);
		if (change) {
			System.out.println("Remove successfully");
		} else {
			System.out.println("Not found in list of tracks");
		}
	}
	
	
	//cost
	
	public float totalCost() {
		float cost = 0;
		for (int i=0; i < itemsOrdered.size(); i++) {
			cost += itemsOrdered.get(i).getCost();
		}
		return cost;
	}
	// Print the list of ordered items of a cart:
	public void print() {
		String result = "********************CART*********************\n\n";
		float total_cost = 0;
		result += "Ordered Items:\n";
		for (int i = 0; i < itemsOrdered.size(); i++) {
			Media m = itemsOrdered.get(i);
			result += (i+1) + m.toString() +"\n";
			total_cost += m.getCost();
		}
		result += "Total cost: " + total_cost +"\n";
		result += "************************************************\n";
		System.out.print(result);
	}
	
	// Search by ID:
	public Media searchID(int id) {
		int check = 0;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getId() == id) {
				return itemsOrdered.get(i);
			}
		}
		return null;
	}
	//Search by Title:
	public Media searchTitle(String title) {
		for (Media m: itemsOrdered) {
			if (m.getTitle() == title) {
				return m;
			}
		}
		return null;
	}
	public int getQuantity() {
		return itemsOrdered.size();
	}

	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
	
	
	
}
