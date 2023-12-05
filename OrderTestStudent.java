
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Tests order class methods
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderTestStudent {

	@Test
	void testOrder() {
		Customer customer1 = new Customer ( "Zain", 20 );
		Order order1 = new Order ( 11, Day.SUNDAY, customer1 );
		assertEquals( "order number: 0, time: 11, day: SUNDAY, customer: name: Zain, age: 20, beverages: ", order1.toString());
		
	}

	@Test
	void testGenerateOrder() {
		Customer customer1 = new Customer ( "Zain", 20 );
		Order order1 = new Order ( 11, Day.SUNDAY, customer1 );
		int number = order1.generateOrder();
		assertEquals( number, order1.getOrderNo());
		
	}

	@Test
	void testGetOrderNo() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		int number = order1.generateOrder();
		assertEquals( number, order1.getOrderNo());
	}

	@Test
	void testGetOrderTime() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		assertEquals( 10, order1.getOrderTime());
	}

	@Test
	void testGetOrderDay() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		assertEquals( Day.FRIDAY, order1.getOrderDay());
	}

	@Test
	void testGetCustomer() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		assertEquals( "Ema", order1.getCustomer().getName());
		assertEquals( 19, order1.getCustomer().getAge());
	}

	@Test
	void testGetDay() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		assertEquals( Day.FRIDAY, order1.getDay());
	}

	@Test
	void testIsWeekend() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		assertEquals( false, order1.isWeekend());
		Order order2 = new Order ( 10, Day.SUNDAY, customer1 );
		assertEquals( true, order2.isWeekend());
	}

	@Test
	void testGetBeverage() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		order1.addNewBeverage("Vodka", Size.MEDIUM);
		assertEquals( "Vodka", order1.getBeverage(0).getBevName());
		assertEquals( Size.MEDIUM, order1.getBeverage(0).getSize());
		assertEquals( false, order1.isWeekend());
	}

	@Test
	void testGetTotalItems() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		order1.addNewBeverage("Vodka", Size.MEDIUM);
		assertEquals( 1, order1.getTotalItems());
	}

	@Test
	void testAddNewBeverageStringSizeBooleanBoolean() {
		Customer customer1 = new Customer ( "Zain", 21 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		order1.addNewBeverage("Latte", Size.LARGE, true, true);
		assertEquals( "Latte", order1.getBeverage(0).getBevName());
		assertEquals( Size.LARGE, order1.getBeverage(0).getSize());
	}

	@Test
	void testAddNewBeverageStringSize() {
		Customer customer1 = new Customer ( "Zain", 21 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		order1.addNewBeverage("Gin", Size.SMALL);
		assertEquals( "Gin", order1.getBeverage(0).getBevName());
		assertEquals( Size.SMALL, order1.getBeverage(0).getSize());
		assertEquals( false, order1.isWeekend());
	}

	@Test
	void testAddNewBeverageStringSizeIntBoolean() {
		Customer customer1 = new Customer ( "Zain", 21 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		order1.addNewBeverage("Strawberry", Size.MEDIUM, 3, true);
		assertEquals( "Strawberry", order1.getBeverage(0).getBevName());
		assertEquals( Size.MEDIUM, order1.getBeverage(0).getSize());
	}

	@Test
	void testCalcOrderTotal() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		order1.addNewBeverage("Vodka", Size.MEDIUM);
		assertEquals( 3.0, order1.calcOrderTotal());
	}

	@Test
	void testFindNumOfBeveType() {
		Customer customer1 = new Customer ( "Zain", 21 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		order1.addNewBeverage("Strawberry", Size.MEDIUM, 3, true);
		order1.addNewBeverage("Mango", Size.SMALL, 1, false);
		order1.addNewBeverage("Gin", Size.SMALL);
		order1.addNewBeverage("Latte", Size.LARGE, true, true);
		assertEquals( 2, order1.findNumOfBeveType(Type.SMOOTHIE));
	}

	@Test
	void testToString() {
		Customer customer1 = new Customer ( "Ema", 19 );
		Order order1 = new Order ( 10, Day.SUNDAY, customer1 );
		assertEquals( "order number: 0, time: 10, day: SUNDAY, customer: name: Ema, age: 19, beverages: ", order1.toString());

	}

	@Test
	void testCompareTo() {
		Customer customer1 = new Customer ( "Zain", 21 );
		Order order1 = new Order ( 10, Day.FRIDAY, customer1 );
		Order order2 = new Order ( 12, Day.SUNDAY, customer1 );
		assertEquals( 0, order1.compareTo(order2));
	}

}
