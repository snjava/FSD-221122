import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Abc");
		list.add(123);
		list.add(234.56);
		list.add('A');
		list.add("Abc");
		System.out.println(list);
		
		list.remove("Abc");
		
		System.out.println(list);
		
		boolean result = list.contains("Abc");
		System.out.println(result);
		
		//list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		ArrayList l1 = new ArrayList();
		l1.add("Xyz");
		l1.add(45.43);
		l1.add("Pqr");
		l1.add(123);
		
		list.addAll(l1);
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		list.remove(1);
		System.out.println(list);
		
		list.add(4, 222);
		System.out.println(list);
		
		list.set(1, 'Z');
		System.out.println(list);
	}
}
