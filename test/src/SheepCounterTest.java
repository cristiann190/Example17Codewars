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

	Boolean[] arrayNullItems = {true, true, null, false,
			true, true, true, true,
			true, false, true, false,
			true, false, null, true,
			true, true, true, true,
			false, false, true, true};

	Boolean[] arrayNulll = null;

	@Test
	public void test() {
		assertEquals(SheepCounter.countSheeps(array1), 17, "There are 17 sheeps in total");
	}

	@Test
	public void testWithNullArray() {
		assertEquals(SheepCounter.countSheeps(arrayNulll), 0, "There are 0 sheeps in total");
	}

	@Test
	public void testWithNullItems() {
		assertEquals(SheepCounter.countSheeps(arrayNullItems), 16, "There are 16 sheeps in total");
	}
}