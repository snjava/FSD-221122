import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("Abc", 123);
		map.put("Xyz", "Abc");
		map.put("Pqr", 'A');
		map.put("Abc", 444);
		map.put("Demo", 23.43);
		map.put("Stu", 123);
		map.put("Lmn", "Test");
		System.out.println(map);
		
		
		System.out.println(map.higherKey("Lmn"));  //return the higher value than the provided one
		System.out.println(map.higherEntry("Lmn"));
		
		System.out.println(map.lowerKey("Lmn"));  //return the lower value than the provided one
		System.out.println(map.lowerEntry("Lmn"));
		
		System.out.println(map.ceilingKey("Lmn"));  // return the equal or higher value than the provided one
		System.out.println(map.ceilingEntry("Lmn"));
		
		System.out.println(map.floorKey("Lmn"));  // return the equal or lower value than the provided one
		System.out.println(map.floorEntry("Lmn"));
		
	}
}