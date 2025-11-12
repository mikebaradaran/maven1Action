package maven1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		Calculator calc = new Calculator();
		assertEquals(3,  calc.add(1, 2));
	}

}
