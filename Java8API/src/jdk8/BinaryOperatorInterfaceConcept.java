package jdk8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Integer> fun=(x1 , x2)-> x1+x2;
		int result=fun.apply(20, 30);
		System.out.println(result);
		
		BiFunction<Integer,Integer,Integer> fun2=(x1,x2)->x1*x2;
		int mul=fun2.apply(100, 4);
		System.out.println(mul);

	}

}
