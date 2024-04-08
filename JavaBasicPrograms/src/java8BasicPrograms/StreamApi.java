package java8BasicPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// Example 1: Filtering elements
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");
		List<String> filteredFruits = fruits.stream().filter(fruit -> fruit.startsWith("A")).collect(Collectors.toList());
		System.out.println("Filtered fruits: " + filteredFruits);
		List<String> fFruits= fruits.stream().filter(x->x.startsWith("O")).collect(Collectors.toList());
				System.out.println(fFruits);
				

		// Example 2: Mapping elements
		List<Integer> wordLengths = fruits.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Word lengths: " + wordLengths);


	}

}
