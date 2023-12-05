
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Tests customer class methods
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTestStudent {

	@Test
	void testCustomerStringInt() {
		Customer customer1 = new Customer ( "Jenny", 21 );
		assertEquals("name: Jenny, age: 21", customer1.toString());
	}

	@Test
	void testCustomerCustomer() {
		Customer customer1 = new Customer ( "Jenny", 21 );
		Customer customer2 = new Customer ( customer1 );
		assertEquals(customer1.getName(), customer2.getName());
		assertEquals(customer1.getAge(), customer2.getAge());
	}

	@Test
	void testGetAge() {
		Customer customer3 = new Customer ( "Jenny", 21 );
		assertEquals(21, customer3.getAge());
		
	}

	@Test
	void testSetAge() {
		Customer customer3 = new Customer ( "Jenny", 21 );
		customer3.setAge(25);
		assertEquals(25, customer3.getAge());
		
	}

	@Test
	void testGetName() {
		Customer customer5 = new Customer ( "Jenny", 21 );
		assertEquals("Jenny", customer5.getName());
		
	}

	@Test
	void testSetName() {
		Customer customer6 = new Customer ( "Jenny", 21 );
		customer6.setName("Grace");
		assertEquals("Grace", customer6.getName());
		
	}

	@Test
	void testToString() {
		Customer customer7 = new Customer ( "Mary", 19 );
		assertEquals("name: Mary, age: 19", customer7.toString());
	}

}
