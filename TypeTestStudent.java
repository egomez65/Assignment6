
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Tests enumerated type class.
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

class TypeTestStudent {

	@Test
	void test() {
        assertEquals("SMOOTHIE", Type.SMOOTHIE.toString());
        assertEquals("ALCOHOL", Type.ALCOHOL.toString());
        assertEquals("COFFEE", Type.COFFEE.toString());
        
	}

}
