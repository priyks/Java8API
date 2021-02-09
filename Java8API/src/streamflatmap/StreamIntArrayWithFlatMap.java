package streamflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntArrayWithFlatMap {

	public static void main(String args[]) {
		int array[] = { 1, 3, 5, 6, 8, 7, 5, 3, 8, 9, 0, 1, 3, 2, 5, 6, 7, 8 };

		Stream<int[]> streamArray = Stream.of(array);
		IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
		intStream.forEach(System.out::println);
		System.out.println("------");
		Stream<int[]> streamArray1 = Stream.of(array);
		IntStream intStream1=streamArray1.flatMapToInt(x-> Arrays.stream(x)).distinct();
		intStream1.forEach(System.out::println);
		

	}

}
