package hust.soict.dsai.aims.cart;

import java.util.NoSuchElementException;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import  hust.soict.dsai.aims.media.Media;

public class Cart {
	
	public static final int MAX_NUMBER_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    
    public void addMedia(Media media) throws LimitExceededException {
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("Added " + media.getTitle() + " to the cart.");
        } else {
            throw new LimitExceededException("The cart is full!");
        }
    }
    
    public void removeMedia(Media media) throws NoSuchElementException {
        if (itemsOrdered.remove(media)) {
            System.out.println("Removed " + media.getTitle() + " from the cart.");
        } else {
            throw new NoSuchElementException(media.getTitle() + " is not in the cart.");
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
	public String toString() {
		String result = "********************CART*********************\n\n";
		float total_cost = 0;
		result += "Ordered Items:\n";
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(itemsOrdered);
			Media m = itemsOrdered.get(i);
			System.out.println(m);
			result += "Media " + (i+1)+ ": " + m.toString() +"\n";
			total_cost += m.getCost();
		}
		result += "Total cost: " + total_cost +"\n";
		result += "************************************************\n";
		return result;
	}
	
	// Search by ID:
	public Media searchID(int id) {
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
			if (m.getTitle().equals(title)) {
				return m;
			}
		}
		return null;
	}
	public int getQuantity() {
		return itemsOrdered.size();
	}

	public  ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	
}
