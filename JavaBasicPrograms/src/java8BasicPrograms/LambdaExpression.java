package java8BasicPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class LambdaExpression {

	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(1,12,25,10,5,15,45,30);
		int sum=num.stream().filter(x->x%2==0).mapToInt(x->x*2).sum();
		System.out.println( "Total Sum:"+sum);
		
		// Example 1: Basic Lambda Expression
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println("Sum: " + add.apply(5, 3));

		// Example 2: Lambda Expression with parameters and body
		BiFunction<Integer, Integer, Integer> sumAndPrint = (x, y) -> {
		    int result = x + y;
		    System.out.println("Adding " + x + " and " + y + ": " + result);
		    return result;
		};
		System.out.println("Result: " + sumAndPrint.apply(10, 20));

	}

}
