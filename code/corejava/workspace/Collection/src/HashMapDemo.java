import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("ABC", 123);
		map.put("XYZ", 1.23);
		map.put(21, "Pqr");
		map.put(23.21, 'Z');
		map.put("ABC", 444);
		map.put('A', null);
		map.put(111, 1.23);
		map.put(null, 1.23);
		map.put('Z', null);
		
		System.out.println(map);
		
		System.out.println(map.get("ABC"));
		map.remove("ABC");
		//map.remove("ABC", 123);
		System.out.println(map);
		
		System.out.println(map.containsKey("XYZ"));
		System.out.println(map.containsValue("123"));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		map.replace("XYZ", 1.23, 111);
		System.out.println(map);
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map);
		
		//map.putAll(map);
		
	}
}
