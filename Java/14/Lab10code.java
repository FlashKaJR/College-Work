import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lab10code {

	public static void map() {
		Map<String, Integer> map = new TreeMap<>();
		
		map.put("Ford", 2019);
		map.put("Audi", 2015);
		map.put("Polo", 2023);
		map.put("Beetle", 2012);
		
		System.out.println(map);
		
		System.out.println("Ford: " +map.containsKey("Ford"));
		System.out.println("2023: " +map.containsValue(2023));
		
		map.remove("Polo");
		map.replace("Audi", 2016);
		System.out.println(map);
		//System.out.println(map.keySet());
		for(String item:map.keySet()) {
			System.out.println(item);
		}
		for (Integer values:map.values()) {
			System.out.println(values);
		}		
	}
	
	public static void listOfAnimals() {
		List<String> list = new ArrayList<String>();
		list.add("Ape");
		list.add("Bee");
		list.add("Cat");
		list.add("Elephant");
		list.add("Fox");		
		System.out.println(list);
		
		list.add(list.indexOf("Elephant"), "Dog");
		System.out.println(list);
		
		System.out.println("List size: " + list.size());
		
		System.out.println("Panda: " +list.contains("Panda"));
		
		list.remove("Elephant");
		System.out.println(list);
		
		System.out.println("Empty: " + list.isEmpty());
		
		list.set(list.indexOf("Fox"), "Cat");
		System.out.println(list);
	}
	
	public static void main(String[] args) {
//		map();
//		listOfAnimals();
		try {
			ex1();
		} catch (IOException e) {
			e.printStackTrace();			
		}
//		set();
		generics();
		
	}
	
	public static void ex1() throws IOException {
		
	}
	
	public static void set() {
		
		Set<String> set = new TreeSet<String>();
		
		set.add("10");
		set.add("20");
		set.add("30");
		set.add("40");
		
		System.out.println(set);
		
		set.add("60");

		
		set.remove("30");
		System.out.println(set);
		System.out.println("50: " +set.contains("50"));
		
		set.clear();		
		System.out.println("Empty: " + set.isEmpty());
		
	}
	
	public static void generics() {
		SomeGenericClass<Integer> genI = new SomeGenericClass<>();
		SomeGenericClass<String> genS = new SomeGenericClass<>();
		
		genS.add("Holiday");
		System.out.println(genS.get());
		genI.add(12);
		System.out.println(genI.get());
	}
}
