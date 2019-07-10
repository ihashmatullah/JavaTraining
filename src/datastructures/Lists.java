package datastructures;
import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1. Create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		// 2. Add some elements
		cities.add("Kabul");
		cities.add("Balkh");
		cities.add("Herat");
		cities.add("Kandahar");
		
		// 3. Iterate the collection
		for (String city : cities) {
			System.out.println(city);
		}
		
		// 4. Get the size
		int size = cities.size();
		System.out.println("There are " + size + " elements in the collection");
		
		// 5. Retrieve specific element
		System.out.println(cities.get(0));
		
		// 6. Remove
		cities.remove(0);
		size = cities.size();
		System.out.println("Now, there are " + size + " elements in the collection");
		for (String city : cities) {
			System.out.println(city);
		}
	}

}
