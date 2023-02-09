import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(123);
		set.add(321);
		set.add(13);
		set.add(12);
		set.add(33);
		set.add(121);
		set.add(123);
		set.add(12);
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.higher(123)); // return the higher value than the provided one
		System.out.println(set.lower(123)); // return the lower value than the provided one
		
		System.out.println(set.ceiling(123)); // return the equal or higher value than the provided one
		System.out.println(set.floor(123)); // return the equal or lower value than the provided one
		
	}
}
