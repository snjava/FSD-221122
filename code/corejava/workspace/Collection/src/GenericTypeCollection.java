import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class GenericTypeCollection {
	public static void main(String[] args) {
		TreeSet<Double> set = new TreeSet<Double>();
		set.add(78.65);
		set.add(65.15);
		set.add(67.61);
		set.add(71.45);
		set.add(67.32);
		set.add(89.12);
		System.out.println(set);
		
		Iterator<Double> it = set.iterator();
		while(it.hasNext()) { // return true id next value is present else returns false
			System.out.println(it.next()); // to get the next value.
		}
		System.out.println("=======================");
		for(Double d : set) {
			System.out.println(d);
		}
		
		
		
		
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("Abc", 54.23);
		map.put("Pqr", 65.23);
		map.put("Lmn", 42.23);
		map.put("Xyz", 71.23);
		System.out.println(map);
		
	}
}
