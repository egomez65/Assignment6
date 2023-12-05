
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Tests alcohol class methods
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

class AlcoholTestStudent {

	@Test
	void testToString() {
		Alcohol alcohol1 = new Alcohol ( "Vodka", Size.SMALL , false );
		assertEquals("name: Vodka, size: SMALL, weekend?: false", alcohol1.toString());
		
	}

	@Test
	void testEqualsObject() {
		Alcohol alcohol2 = new Alcohol ( "Beer", Size.SMALL , false );
		Alcohol alcohol3 = new Alcohol ( "Beer", Size.SMALL , false );
		assertTrue(alcohol2.equals(alcohol3));
		
	}

	@Test
	void testCalcPrice() {
		Alcohol alcohol4 = new Alcohol ( "Vodka", Size.MEDIUM , true );
		assertEquals(3.60, alcohol4.calcPrice(), .01);
		
	}

	@Test
	void testAlcohol() {
		Alcohol alcohol5 = new Alcohol ( "Tequila", Size.LARGE , true );
		assertEquals("name: Tequila, size: LARGE, weekend?: true", alcohol5.toString());
		
	}

	@Test
	void testIsWeekend() {
		Alcohol alcohol6 = new Alcohol ( "Gin", Size.MEDIUM , true );
		assertTrue(alcohol6.isWeekend());
		
	}

}
