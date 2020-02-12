package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    int[] array;
    int[] negatives;

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

        negatives = new int[10];
        negatives[0] = -5;
        negatives[1] = -100;
        negatives[2] = -83;
        negatives[3] = -56;
        negatives[4] = -7;
        negatives[5] = -12;
        negatives[6] = -99;
        negatives[7] = -54;
        negatives[8] = -10;
        negatives[9] = -62;
    }

    @Test
    public void testInsertionSort() {
        int[] expectedOutput = {11, 12, 23, 37, 42, 45, 56, 80, 99, 101};
        assertArrayEquals("should return sorted array equal to expectedOutput", expectedOutput, Sort.insertionSort(array));
    }

    @Test
    public void testInsertionSortNegatives() {
        int[] expectedOutput = {-100, -99, -83, -62, -56, -54, -12, -10, -7, -5};
        assertArrayEquals("should return sorted array of negative values", expectedOutput, Sort.insertionSort(negatives));
    }
}