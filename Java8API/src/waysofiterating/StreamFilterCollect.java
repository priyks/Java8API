package waysofiterating;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> productList = Arrays.asList("Shoes", "Book", "Mobile", "iphone", "Sony Tv", "Washing machine",
				"Laptop");
		System.out.println("----------");
		System.out.println(productList);
		System.out.println("----------");
		List newList = productList.stream().filter(ele -> !ele.equals("Book")).collect(Collectors.toList());

		newList.forEach(System.out::println);

		System.out.println("----------");

		newList.forEach(ele -> System.out.println(ele));

	}

}
