package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    int[] array;

    @Before
    public void preTestBuild() {
        array = new int[10];
        array[0] = 101;
        array[1] = 37;
        array[2] = 80;
        array[3] = 56;
        array[4] = 23;
        array[5] = 12;
        array[6] = 99;
        array[7] = 45;
        array[8] = 42;
        array[9] = 11;
    }

    @Test
    public void testInsertionSort() {
        int[] expectedOutput = {11, 12, 23, 37, 42, 45, 56, 80, 99, 101};
        assertEquals("should return sorted array equal to expectedOutput", expectedOutput, InsertionSort.insertionSort(array));
    }
}