package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> fun = x -> x > 100;
		List<Integer> mylist = Arrays.asList(190,88, 8, 90, 567,5, 435,98, 101);
		System.out.println(mylist);
		List<Integer> greater = mylist.stream().filter(fun).collect(Collectors.toList());

		System.out.println(greater);
		
		Set<Integer> myset=mylist.stream().filter(x-> x >50 && x < 300).collect(Collectors.toSet());
		System.out.println(myset);
		
		List<String> names = Arrays.asList("priya","priyanka","pihu","piku","pillu");
		
	    Predicate<String> nameAlt= x-> x.startsWith("pi");
	    
		List<String> myNewList=names.stream().filter(nameAlt.negate()).collect(Collectors.toList());
		System.out.println(myNewList);
		

	}

}
