
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Tests day class
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

class DayTestStudent {

	@Test
	void test() {
        assertEquals("SUNDAY", Day.SUNDAY.toString());
        assertEquals("MONDAY", Day.MONDAY.toString());
        assertEquals("TUESDAY", Day.TUESDAY.toString());
        assertEquals("WEDNESDAY", Day.WEDNESDAY.toString());
        assertEquals("THURSDAY", Day.THURSDAY.toString());
        assertEquals("FRIDAY", Day.FRIDAY.toString());
        assertEquals("SATURDAY", Day.SATURDAY.toString());
        
	}
}
