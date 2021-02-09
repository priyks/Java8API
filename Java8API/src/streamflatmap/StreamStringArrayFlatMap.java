package streamflatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStringArrayFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] objects = new String[][] { { "A", "B", "C" }, { "P", "Q", "R" }, { "X", "Y", "Z" },
				{ "D", "E", "F" } };
				
				
				Stream<String[]> dataStream=Arrays.stream(objects);
				// apply flat map on data stream
				
			  Stream<String> streamFlatMap=dataStream.flatMap(x-> Arrays.stream(x));
			  Stream<String> streamFilter=streamFlatMap.filter(x-> "Q".equals(x.toString()));
			  streamFilter.forEach(System.out::println);
			  
			  Stream<String> finalStream=Arrays.stream(objects)
					  .flatMap(x->Arrays.stream(x))
					  .filter(x-> "Q".equals(x.toString()));
			  finalStream.forEach(System.out::println);

	}

}
