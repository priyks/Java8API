package jdk8;

import java.util.function.Function;

/**
 * 
 * @author priyankaku
 *
 */
public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * interface Function <T,R> Type Parameter
		 * 
		 * @param <T> the type of the input to the function
		 * @param <R> the type of the result of the function
		 */
		Function<String, Integer> fun = x -> x.length(); // first x is type of input which is string and second
															// x.length() is type of result

		int len = fun.apply("Priyanka");
		System.out.println(len);
		//System.out.println(fun.apply("kulkarni"));

		Function<Integer, Integer> fun1 = x -> x * 3;
		int result = fun.andThen(fun1).apply("courageous");
		System.out.println(result);

	}

}
