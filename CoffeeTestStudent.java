
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Tests coffee class methods
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

	@Test
	void testToString() {
		Coffee coffee1 = new Coffee ( "Espresso", Size.SMALL , true, true );
		assertEquals("name: Espresso, size: SMALL, extra shot?: true, extra syrup?: true", coffee1.toString());
		
	}

	@Test
	void testEqualsObject() {
		Coffee coffee2 = new Coffee ( "Latte", Size.MEDIUM , false, true );
		Coffee coffee3 = new Coffee ( "Latte", Size.MEDIUM , false, true );
		assertTrue(coffee2.equals(coffee3));
		
	}

	@Test
	void testCalcPrice() {
		Coffee coffee4 = new Coffee ( "Frappe", Size.LARGE , true, false );
		assertEquals(4.50, coffee4.calcPrice(), .01);
		
	}

	@Test
	void testCoffee() {
		Coffee coffee5 = new Coffee ( "Cappuccino", Size.SMALL , true, true );
		assertEquals("name: Cappuccino, size: SMALL, extra shot?: true, extra syrup?: true", coffee5.toString());
	}

	@Test
	void testGetExtraShot() {
		Coffee coffee6 = new Coffee ( "Americano", Size.LARGE, true, false );
		assertTrue(coffee6.getExtraShot());
		
	}

	@Test
	void testGetExtraSyrup() {
		Coffee coffee7 = new Coffee ( "Iced coffee", Size.MEDIUM, false, true );
		assertTrue(coffee7.getExtraSyrup());
		
	}

}
