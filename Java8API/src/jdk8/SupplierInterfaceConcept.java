package jdk8;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {
	
  public static void main(String args[]) {
	  
	  getText(()->"Hi hello I am happy.. ");
	  getText(()->"java");
	  getText(()->"JDK 8 Features");
  }
  public static void getText(Supplier<String> text) {
	  
	  System.out.println(text.get());
  }

}
