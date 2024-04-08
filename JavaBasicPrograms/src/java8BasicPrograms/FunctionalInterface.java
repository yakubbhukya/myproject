package java8BasicPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		// Example 1: Built-in functional interface - Predicate
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 10);
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		// Find the Even Numbers with help of Filtering
		List<Integer> evenNumbers = numbers.stream()
				.filter(isEven)
				.collect(Collectors.toList());
		System.out.println("Even numbers: " + evenNumbers);
		
		// Find the Odd Numbers with help of Filtering
		List<Integer> oddNumbers= numbers.stream()
				.filter(x->x%2 !=0)
				.collect(Collectors.toList());
		System.out.println("Odd Numbers :" + oddNumbers);
		
		// Find the Sum of All numbers
		int sumOfNumbers= numbers.stream()
					.mapToInt(Integer::intValue)
					.sum();
		System.out.println("Sum of List:"+sumOfNumbers);
		
		// Square of Each Number
		List<Integer> squaredNumber=numbers.stream()
									.map(x->x*x).collect(Collectors.toList());
		System.out.println("Square of Each Number: "+squaredNumber);
		
		// Find the sum of all numbers
		int sum = numbers.stream()
		                 .reduce(0, Integer::sum);
		System.out.println("Sum of numbers: " + sum);
		
		// Check if any number is greater than 5
		boolean anyGreaterThanFive = numbers.stream()
		                                   .anyMatch(n -> n > 5);
		System.out.println("Any number greater than 5? " + anyGreaterThanFive);

		// Check if all numbers are greater than 0
		boolean allGreaterThanZero = numbers.stream()
		                                   .allMatch(n -> n > 0);
		System.out.println("All numbers greater than 0? " + allGreaterThanZero);
//--------------------------------------------
		List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3);

		// Remove duplicates
		List<Integer> distinctNumbers = duplicateNumbers.stream()
		                                                .distinct()
		                                                .collect(Collectors.toList());
		System.out.println("Distinct numbers: " + distinctNumbers);

				
		
		// Example 2: Custom functional interface

		interface MyFunctionalInterface {
		    void myMethod(String s);
		}

		MyFunctionalInterface myFunction = s -> System.out.println("My method: " + s);
		myFunction.myMethod("Hello, world!");


	}

}
