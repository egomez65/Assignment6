
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Tests the enumerated size class
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

class SizeTestStudent {

	@Test
	void test() {
        assertEquals("SMALL", Size.SMALL.toString());
        assertEquals("MEDIUM", Size.MEDIUM.toString());
        assertEquals("LARGE", Size.LARGE.toString());
        
	}

}
