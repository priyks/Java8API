package parallelstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// return how many cores in system
		ForkJoinPool corePools = ForkJoinPool.commonPool();
		System.out.println(corePools.getParallelism());// 3

		// normal stream
		Stream stream = Stream.of("ariya", "ajinkya", "arisha", "ashwariya", "prakash", "prashant", "manik");
		stream.forEach(System.out::println);
		System.out.println("---------");
		
		// parallelStream

		Stream.of("ariya", "ajinkya", "arisha", "ashwariya", "prakash", "prashant", "manik").parallel()
				.forEach(System.out::println);
		System.out.println("---------");
		
		// use parallel method on collection 
		
		Arrays.asList(1,2,3,4,5,6,7,8,9).parallelStream().forEach(System.out::println);
		
		System.out.println("---------");
		
		// normal stream 
		
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println("---------");
		
		// parallel stream  
	
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		System.out.println("---------");
		// normal Stream
		getAlphabetList().stream().forEach(System.out::println);
		System.out.println("---------");
		// parallel Stream
		getAlphabetList().parallelStream().forEach(System.out::println);
		
	}
	
	public static List<String> getAlphabetList(){
		
		List<String> alpha=new ArrayList<String>();
		int n=97;
		while(n<=122) {
			char c=(char)n;
			alpha.add(String.valueOf(c));
			n++;
		}
		
		return alpha;
	}

}

