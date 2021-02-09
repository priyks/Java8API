package jdk8;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<Integer> fun= x -> x * 7;
		int result=fun.apply(5);
		System.out.println(result);
		
		ArrayList<String> mylist=new ArrayList<>();
		
		mylist.add("Priyanka");
		mylist.add("Rushikesh");
		mylist.add("Omkar");
	    
		System.out.println(mylist);
		mylist.replaceAll(ele -> ele +  " Kulkarni");
		System.out.println(mylist);
		
		

	}

}
