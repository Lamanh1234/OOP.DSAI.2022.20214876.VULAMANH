package hust.soict.dsai.aims.media;
import java.util.*;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	public int compare(Media m1, Media m2) {
		int costCompare = Float.compare(m1.getCost(), m2.getCost());
		if (costCompare != 0) {
			return costCompare;
		}
		return m1.getTitle().compareTo(m2.getTitle());
	}
}
