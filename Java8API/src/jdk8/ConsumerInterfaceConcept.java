package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer com=x-> System.out.println(x);
		com.accept("I am courageous and humble.");
		List<Integer> mylist = Arrays.asList(190,88, 8, 90, 567,5, 435,98, 101);
		mylist.forEach(x -> System.out.println(x));
		

	}

}
