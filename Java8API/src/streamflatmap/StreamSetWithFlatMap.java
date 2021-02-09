package streamflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetWithFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp1=new Employee();
		emp1.setName("Riya");
		emp1.addDevices("iphone 8");
		emp1.addDevices("LED Sony xp");
		emp1.addDevices("mac book");
		emp1.addDevices("samsung smart watch");
		
		
		Employee emp2=new Employee();
		emp2.setName("Priya");
		emp2.addDevices("samsang galaxy j2");
		emp2.addDevices("honor i4");
		emp2.addDevices("dell laptop");
		emp2.addDevices("samsung smart watch");
		
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		
		List<String> mydevices=employeeList.stream()
				.map(x-> x.getDevices()) //Stream<Set<String>>
				.flatMap(x ->x.stream()) // Stream<String>
				.distinct()
				.collect(Collectors.toList());
		
		mydevices.forEach(x-> System.out.println(x));
		
	}

}
