package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		// Create a new Cart
		Cart anOrder = new Cart();
		
		// Create new dvd object and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
						"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
								"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
							"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		// Print total cost of the items in the cart:
		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		// Remove:
		System.out.print("The current quantity: ");
		System.out.println(anOrder.getQuantity());
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.print("The quantity after removing: ");
		System.out.println(anOrder.getQuantity());
	}

}
