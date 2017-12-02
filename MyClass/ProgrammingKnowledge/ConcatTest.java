package ProgrammingKnowledge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {

	@Test
	void test() {
	MyJUnitClass junit = new MyJUnitClass();
	String resultString = junit.concatStrings("Ramesh", "Babu");
	assertEquals("RameshBabu",resultString);
	}

}
