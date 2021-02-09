package waysofiterating;

public class Customer {

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	private String name;
	private int age;

	public Customer(String name2, int age2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
		this.age = age2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
