package javamethods;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {

	
		// TODO Auto-generated method stub
		
		public static void main(String[] args) {
	        // Creating a HashSet
	        Set<String> mySet = new HashSet<>();

		        // Adding elements to the set using the set method
		        mySet.add("Apple");
		        mySet.add("Banana");
		        mySet.add("Orange");

		       
		        mySet.remove(0);
		        // Adding a duplicate element (will not be added)
		        mySet.add("Orange");

		        // Displaying the elements of the set
		        System.out.println("Elements in the set: " + mySet);
		        
		        
//		        map methods
		        List<String> words = Arrays.asList("apple", "banana", "orange");

		        // Using the map method to convert each word to uppercase
		        List<String> uppercasedWords = words.stream()
		                                           .map(String::toUpperCase)
		                                           .collect(Collectors.toList());

		        // Displaying the result
		        System.out.println("Original words: " + words);
		        System.out.println("Uppercased words: " + uppercasedWords);
		        
//		        list methods
		        List<String> myList = new ArrayList<>();
		        myList.add("Item 1");
		        myList.add("Item 2");
		        System.out.println(myList);
		        String item = myList.get(0); // Retrieves the first item in the list
                System.out.println(item);
		        myList.remove(1); // Removes the second item in the list

		        int size = myList.size();
		        System.out.println(size);
		        boolean containsItem = myList.contains("Item 1"); // Checks if "Item 1" is in the list
		        System.out.println(containsItem);
		        List<String> additionalItems = Arrays.asList("Item 3", "Item 4");
		        myList.addAll(additionalItems); // Adds all items from additionalItems to the end of myList
		        System.out.println(myList);
		        
//		        map 
		        Map<String, Integer> map = new HashMap<>();
		        map.put("One", 10);
		        map.put("Two", 20);
		        map.put("Three", 30);
		        System.out.println("Map: " + map);
		    }
		

	}


