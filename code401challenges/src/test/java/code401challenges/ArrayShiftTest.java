package code401challenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class ArrayShiftTest {

    @Test public void testInsertShiftArrayMethod() {
        int[] input = {1, 2, 3, 4};
        int[] output = {1, 2, 99, 3, 4};

        assertArrayEquals(output, code401challenges.ArrayShift.insertShiftArray(input, 99));
    }

    @Test public void testFailureShiftArray() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] output = {1, 2, 99, 3, 4, 5, 6};

        assertNotEquals(output, code401challenges.ArrayShift.insertShiftArray(input, 99));
    }
}
