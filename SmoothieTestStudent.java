
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Tests smoothie class methods
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

class SmoothieTestStudent {

	@Test
	void testToString() {
		Smoothie smoothie1 = new Smoothie ( "Strawberry", Size.LARGE , 3, false );
		assertEquals("name: Strawberry, size: LARGE, protein?: false, number of fruits: 3", smoothie1.toString());
		
	}

	@Test
	void testEqualsObject() {
		Smoothie smoothie2 = new Smoothie ( "Lychee", Size.LARGE , 4, false );
		Smoothie smoothie3 = new Smoothie ( "Lychee", Size.LARGE , 4, false );
		assertTrue(smoothie2.equals(smoothie3));
		
	}

	@Test
	void testCalcPrice() {
		Smoothie smoothie4 = new Smoothie ( "Peach", Size.LARGE , 2, true );
		assertEquals(6.50, smoothie4.calcPrice(), .01);
		
	}

	@Test
	void testSmoothie() {
		Smoothie smoothie5 = new Smoothie ( "Mango", Size.MEDIUM , 1, true );
		assertEquals("name: Mango, size: MEDIUM, protein?: true, number of fruits: 1", smoothie5.toString());
		
	}

	@Test
	void testGetNumOfFruits() {
		Smoothie smoothie6 = new Smoothie ( "Pineapple", Size.SMALL, 1, true );
		assertEquals(1, smoothie6.getNumOfFruits(), .01);
		
	}

	@Test
	void testGetAddProtein() {
		Smoothie smoothie7 = new Smoothie ( "Blueberry", Size.MEDIUM, 1, true );
		assertTrue(smoothie7.getAddProtein());
		
	}

}
