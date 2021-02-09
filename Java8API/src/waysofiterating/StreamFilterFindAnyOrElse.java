package waysofiterating;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Priyanka", 35);
		Customer c2 = new Customer("Rushikesh", 23);
		Customer c3 = new Customer("Omkar", 30);
		Customer c4 = new Customer("Shital", 31);
		Customer c5 = new Customer("Pankaj", 34);
		List<Customer> custList = new ArrayList<>();
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		custList.add(c4);
		custList.add(c5);
		System.out.println(custList);
		String s1 = custList.stream().filter(x -> x.getName() == "Priyanka").map(Customer::getName).findAny()
				.orElse(null);
		System.out.println(s1);
		System.out.println("-----------using predicator---------");
		List<Customer> findEntry = custList.stream().filter(x -> x.getAge() < 35 && x.getAge() > 20)
				.collect(Collectors.toList());
		findEntry.forEach(System.out::println);
		System.out.println("--------using map function ");
		List<String> custName = custList.stream().map(Customer::getName).collect(Collectors.toList());
		custName.forEach(System.out::println);

	}

}
