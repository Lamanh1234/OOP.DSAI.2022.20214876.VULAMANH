package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBERS_DVD = 100;
	DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_DVD];
	private int numbers_DVD;
	
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore[numbers_DVD] = dvd;
		numbers_DVD ++;
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		int deletePoint = -1;
		for (int i = 0; i < numbers_DVD; i++) {
			if (dvd.equals(itemsInStore[i])) {
				deletePoint = i;
				break;
			}
		}
		if (deletePoint != -1) {
			for (int i = deletePoint; i <= numbers_DVD-2; i++) {
				itemsInStore[i] = itemsInStore[i+1];
			}
			numbers_DVD --;
		} else {
			System.out.println("No match is found.");
		}
	}
}
