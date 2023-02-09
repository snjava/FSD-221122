import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(123);
		set.add("Abc");
		set.add(1.23);
		set.add(12.3);
		set.add('P');
		set.add(123);
		set.add("Xyz");
		set.add("Abc");
		System.out.println(set);
		System.out.println(set.size());
	}

}
