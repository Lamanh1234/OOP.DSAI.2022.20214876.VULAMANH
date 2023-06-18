package hust.soict.dsai.aims.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
	
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}


	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	// Swap method can correctly swap the two objects
	public static void swap1(Object o1, Object o2) {
		DigitalVideoDisc dvd1 = (DigitalVideoDisc) o1;
		DigitalVideoDisc dvd2 = (DigitalVideoDisc) o2;
		String title = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(title);
	}
	

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
