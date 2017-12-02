package ProgrammingKnowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	 void addTest() {
		
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(4, 5);
		assertEquals(9,result);
		
	}

}
