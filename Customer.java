
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Creates a customer object
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

public class Customer extends Object {

	private String name;
	private int age;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Customer(Customer c) {
		this.name = c.name;
		this.age = c.age;
		
	}
	
	public int getAge() {
		return age;
		
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		return "name: " + this.name + ", age: " + this.age;
		
	}
	
}
