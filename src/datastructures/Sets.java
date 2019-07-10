package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// LinkedHash - In order that they were entered
		// HashSet - Complete random order
		// TreeSet - Rearranges to natural order/ascending
		// 1. Define the collection
		Set<String> animals = new LinkedHashSet<String>();
		
		// 2. Adding elements
		animals.add("dog");
		animals.add("cow");
		animals.add("sheep");
		animals.add("eagle");
		// System.out.println(animals + " " + animals.size());
		
		animals.add("sheep");
		animals.add("eagle");
		animals.add("goose");
		
		System.out.println(animals + " " + animals.size());
		
		// Create a new set for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("Chicken");
		farmAnimals.add("Horse");
		farmAnimals.add("cat");
		farmAnimals.add("falcon");
		farmAnimals.add("dog");
		
		// What is the INTERSECTION between animals and farm animals
		// 1. Copy the existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);
		// 2. Retain ONLY the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		// What is the UNION
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is the DIFFERENCE
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is " + differenceSet);
		
	}

}
