package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERS = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERS];
	private int qtyOrdered; 
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERS) {
			System.out.println("The cart is already full");
		} else {
			qtyOrdered ++;
			itemsOrdered[qtyOrdered - 1]= disc;
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist) {
		if (dvdlist.length + qtyOrdered > MAX_NUMBERS_ORDERS) {
			System.out.println("The cart is already full");
		} else {
			for (int i = 1; i <= dvdlist.length;i++) {
				itemsOrdered[qtyOrdered] = dvdlist[i-1];
				qtyOrdered++;
			}
		}
	}
	
	public void AddDigitalVideoDisc(DigitalVideoDisc [] dvdlist, int numdvd) {
		if (qtyOrdered + numdvd > MAX_NUMBERS_ORDERS){
			System.out.println("The cart is already full");
		} else {
			for (int i = 1; i <= numdvd; i++) {
				itemsOrdered[qtyOrdered] = dvdlist[i-1];
				qtyOrdered++;
			}
		}
	}
	
	public void AddDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 > MAX_NUMBERS_ORDERS) {
			System.out.println("The cart is already full");
		} else {
			itemsOrdered[qtyOrdered] = dvd1;
			itemsOrdered[qtyOrdered + 1] = dvd2;
			qtyOrdered += 2;
		}
	}
	
	// remove
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int itr = 0;
		while (itr < qtyOrdered) {
			if (itemsOrdered[itr] == disc) {
				itemsOrdered[itr] = null;
				break;
			}
			itr ++;
		}
		
		if (itr == qtyOrdered) {
			System.out.println("Not found that digital video disc");
		} else {
			qtyOrdered --;
		}
	}
	
	//cost
	
	public float totalCost() {
		float cost = 0;
		for (int i=0; i < qtyOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	
	// get qytOrdered
	public int getQuantity(){
		return qtyOrdered;
	}
}