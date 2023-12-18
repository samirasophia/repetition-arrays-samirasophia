package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayUtilsTest {

	@Test
	void sum() {
		// Given
		int[] arr = {2, -5, 9, 0};

		// When
		int actual = ArrayUtils.sum(arr);

		// Then
		assertEquals(6, actual);
	}

	@Test
	void largest() {
		// Given
		int[] arr = {2, -5, 9, 0, -18};

		// When
		int actual = ArrayUtils.largest(arr);

		// Then
		assertEquals(9, actual);
	}

	@Test
	void average() {
		// Given
		int[] arr = {2, -5, 9, 0};

		// When
		double actual = ArrayUtils.average(arr);

		// Then
		assertEquals(1.5, actual);
	}

	@Test
	void reverse() {
		// Given
		int[] arr = {2, -5, 9, 0};

		// When
		int[] actual = ArrayUtils.reverse(arr);

		// Then
		assertArrayEquals(new int[] {0, 9, -5, 2}, actual);
	}

	@Test
	void add() {
		int[] arr1 = {15, 8, 3};
		int[] arr2 = {-5, 6, 0};

		int[] result = ArrayUtils.add(arr1, arr2);

		assertArrayEquals(new int[]{10, 14, 3}, result);
	}
}
