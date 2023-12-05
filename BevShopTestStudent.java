
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Test methods in BevShop class.
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BevShopTestStudent {

	@Test
	void testBevShop() {
		BevShop bevshop1 = new BevShop ();
		assertEquals("orders: total monthly sale: 0.0", bevshop1.toString());
		
	}

	@Test
	void testIsValidTime() {
		BevShop bevshop2 = new BevShop ();
		assertEquals(true, bevshop2.isValidTime(15));
		
	}

	@Test
	void testGetMaxNumOfFruits() {
		BevShop bevshop3 = new BevShop ();
		assertEquals(5, bevshop3.getMaxNumOfFruits());
		
	}

	@Test
	void testGetMinAgeForAlcohol() {
		BevShop bevshop4 = new BevShop ();
		assertEquals(21, bevshop4.getMinAgeForAlcohol());
		
	}

	@Test
	void testIsMaxFruit() {
		BevShop bevshop5 = new BevShop ();
		assertEquals(true, bevshop5.isMaxFruit(6));
		
	}

	@Test
	void testGetMaxOrderForAlcohol() {
		BevShop bevshop6 = new BevShop ();
		assertEquals(3, bevshop6.getMaxOrderForAlcohol());
		
	}

	@Test
	void testIsEligibleForMore() {
		BevShop bevshop7 = new BevShop ();
		bevshop7.processAlcoholOrder("Vodka", Size.SMALL);
		assertEquals(true, bevshop7.isEligibleForMore());
		
	}

	@Test
	void testGetNumOfAlcoholDrink() {
		BevShop bevshop8 = new BevShop();
		bevshop8.startNewOrder( 10, Day.MONDAY, "Zain" , 20 );
		bevshop8.processAlcoholOrder("Vodka", Size.SMALL);
		assertEquals(1, bevshop8.getNumOfAlcoholDrink());
		
	}

	@Test
	void testIsValidAge() {
		BevShop bevshop7 = new BevShop ();
		assertEquals(false, bevshop7.isValidAge(20));
		
	}

	@Test
	void testStartNewOrder() {
		BevShop bevshop10 = new BevShop();
		bevshop10.startNewOrder( 12, Day.SATURDAY, "Ema" , 19 );
		bevshop10.processAlcoholOrder("Gin", Size.MEDIUM);
		assertEquals(1, bevshop10.getNumOfAlcoholDrink());
		
	}

	@Test
	void testProcessCoffeeOrder() {
		BevShop bevshop12 = new BevShop();
		bevshop12.startNewOrder( 9, Day.SUNDAY, "Snow" , 7 );
		bevshop12.processCoffeeOrder("Latte", Size.LARGE, false, false);
		assertEquals( 0, bevshop12.getNumOfAlcoholDrink());
		
	}

	@Test
	void testProcessAlcoholOrder() {
		BevShop bevshop12 = new BevShop();
		bevshop12.startNewOrder( 9, Day.SUNDAY, "Snow" , 39 );
		bevshop12.processAlcoholOrder("Tequila", Size.LARGE);
		bevshop12.processAlcoholOrder("Wine", Size.MEDIUM);
		assertEquals(2, bevshop12.getNumOfAlcoholDrink());
		
	}

	@Test
	void testProcessSmoothieOrder() {
		BevShop bevshop12 = new BevShop();
		bevshop12.startNewOrder( 9, Day.SUNDAY, "Snow" , 7 );
		bevshop12.processSmoothieOrder("Strawberry", Size.LARGE, 2, false);
		assertEquals( 0, bevshop12.getNumOfAlcoholDrink());
	}

	@Test
	void testFindOrder() {
		BevShop bevshop13 = new BevShop();
		bevshop13.startNewOrder( 9, Day.SUNDAY, "Snow" , 7 );
		bevshop13.orders.get(0).getOrderNo();

        assertEquals( -1, bevshop13.findOrder(0));
	}

	@Test
	void testTotalOrderPrice() {
		BevShop bevshop12 = new BevShop();
		bevshop12.startNewOrder( 9, Day.SUNDAY, "Snow" , 7 );
		bevshop12.processSmoothieOrder("Strawberry", Size.LARGE, 2, false);
		assertEquals( 5.0, bevshop12.totalOrderPrice(bevshop12.orders.get(0).getOrderNo()), .01);
		
	}

	@Test
	void testTotalMonthlySale() {
		BevShop bevshop12 = new BevShop();
		bevshop12.startNewOrder( 9, Day.SUNDAY, "Snow" , 7 );
		bevshop12.processSmoothieOrder("Strawberry", Size.LARGE, 2, false);
		assertEquals( 5.0, bevshop12.totalMonthlySale(), .01);
		
	}

	@Test
	void testTotalNumOfMonthlyOrders() {
		BevShop bevshop12 = new BevShop();
		bevshop12.startNewOrder( 9, Day.SUNDAY, "Snow" , 7 );
		bevshop12.processSmoothieOrder("Strawberry", Size.LARGE, 2, false);
		assertEquals( 1, bevshop12.totalNumOfMonthlyOrders(), .01);
		
	}

	@Test
	void testGetCurrentOrder() {
		BevShop bevshop12 = new BevShop();
		bevshop12.startNewOrder( 9, Day.SUNDAY, "Snow" , 7 );
		bevshop12.startNewOrder( 11, Day.MONDAY, "Katie" , 15 );
		assertEquals("Katie", bevshop12.getCurrentOrder().getCustomer().getName());

	}

	@Test
	void testGetOrderAtIndex() {
		BevShop bevshop12 = new BevShop();
		bevshop12.startNewOrder( 9, Day.SUNDAY, "Snow" , 7 );
		assertEquals(Day.SUNDAY, bevshop12.getOrderAtIndex(0).getDay());
		
	}

	@Test
	void testSortOrders() {
        BevShop bevShop = new BevShop();

        bevShop.startNewOrder(3, Day.MONDAY, "John", 25);
        bevShop.startNewOrder(1, Day.SUNDAY, "Alice", 30);
        bevShop.startNewOrder(2, Day.WEDNESDAY, "Bob", 22);

        bevShop.sortOrders();

        ArrayList<Order> sortedOrders = bevShop.orders;

        assertEquals(Day.SUNDAY, sortedOrders.get(2).getOrderDay());
        assertEquals(Day.WEDNESDAY, sortedOrders.get(1).getOrderDay());
        assertEquals(Day.MONDAY, sortedOrders.get(0).getOrderDay());
	}

	@Test
	void testToString() {
		BevShop bevshop1 = new BevShop ();
		assertEquals("orders: total monthly sale: 0.0", bevshop1.toString());
		
	}

}
