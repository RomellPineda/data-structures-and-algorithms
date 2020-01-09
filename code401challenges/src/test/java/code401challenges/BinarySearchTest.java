package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void testBinarySearch() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int output = 2;

        assertEquals(output, code401challenges.BinarySearch.binarySearch(input, 3));
    }

    @Test public void testBinarySearchOutOfBounds() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int output = -1;

        assertEquals(output, code401challenges.BinarySearch.binarySearch(input, 99));
    }

    @Test public void testBinarySearchEmptyArray() {
        int[] input = {};
        int output = -1;

        assertEquals(output, code401challenges.BinarySearch.binarySearch(input, 3));
    }
}
