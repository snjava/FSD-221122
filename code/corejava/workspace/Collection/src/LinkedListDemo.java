import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(20);
		list.add("Abc");
		list.add(20);
		list.add(2.1);
		System.out.println(list);
		list.add(1, "Pqr");
		System.out.println(list);
		
		
		list.addFirst(123);
		list.addLast(321);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		// to add element at the first position
		list.push("Xyz");
		System.out.println(list);
		// to select and remove the element from the first position. It will throw exception if no element present
		System.out.println("POP : "+ list.pop());
		System.out.println(list);
		// To Select and remove the first position element. It will return null if no element present. 
		System.out.println("POLL : " + list.poll());
		System.out.println(list);
		// To Select the first element and it will not removes it.
		System.out.println("PEEK : " + list.peek());
		System.out.println(list);
		
	}
}
