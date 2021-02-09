package sequentialstream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1:
		Stream stream=Stream.of("omkar","rushikesh","prashant","priyanka");
		
		stream.findFirst().ifPresent(System.out::println);
		
		System.out.println("---------");
		// 2:
		Arrays.asList("a1","a2","a3","a4","a5","a6","a7","a8","a9").
		stream().findFirst().
		ifPresent(System.out::println);
		
		System.out.println("---------");
		// 3:
		
		IntStream.range(1, 11).forEach(System.out::println);
		
		System.out.println("---------");
		// 4:
		
		Arrays.stream(new int [] {1,2,3,4}).
		map(x -> 2*x+1).
		average().ifPresent(System.out::println);
		
		// String data to object 
		System.out.println("---------");
		Stream.of("a11","b12","c13","d14").
		map(x-> x.substring(1)).
		mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
		
		System.out.println("---------");
		//Double to String Object
		
		Stream.of(1.22,23.99,98.7).
		mapToInt(Double::intValue).
		mapToObj(x -> "a"+x).
		forEach(System.out::println);
		
		System.out.println("---------");
		
		// limit
		
		Stream.iterate(0,n-> n+1 ).limit(10).forEach(System.out::println);
		
		System.out.println("---------");
		// 10 odd numbers
		
		Stream.iterate(0, n-> n+1).
		filter(x-> x%2!=0).limit(10).
		forEach(System.out::println);
		
	}

}
