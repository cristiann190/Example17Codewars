package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SheepCounterTest {
	Boolean[] array1 = {true, true, true, false,
			true, true, true, true,
			true, false, true, false,
			true, false, false, true,
			true, true, true, true,
			false, false, true, true};

	@Test
	public void test() {
		assertEquals(SheepCounter.countSheeps(array1), 17, "There are 17 sheeps in total");
	}

}