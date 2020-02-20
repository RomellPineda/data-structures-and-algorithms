package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static code401challenges.utilities.Sort.*;
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

    @Test
    public void testMerge() {
        int[] test = {5, 42, 11};
        int[] magazine = new int[test.length];
        merge(test, magazine, 0, 1, 2);
        int[] expected = {5, 11, 42};
        assertArrayEquals("should return merged test array", expected, test);
    }

    @Test
    public void testMergeSort() {
        mergeSort(array);
        int[] expected = {11, 12, 23, 37, 42, 45, 56, 80, 99, 101};
        assertArrayEquals("should return sorted array", expected, array);
    }

    @Test
    public void testSwitcheroo() {
        int[] testArray = {1, 2, 3};
        switcheroo(testArray, 0, 2);
        int[] expected = {3, 2, 1};
        assertArrayEquals("should swap array elements at given indices", expected, testArray);
    }

    @Test
    public void testQuickSort() {
        int[] unsorted = {101, 37, 80, 56, 23, 12, 99, 45, 42, 11};
        assertArrayEquals("should return unsorted array", unsorted, array);
        int[] expected = {11, 12, 23, 37, 42, 45, 56, 80, 99, 101};
        quickSort(array, 0, 9);
        assertArrayEquals("should return sorted array after calling quickSort on array", expected, array);
    }

    @Test
    public void testQuickSortReverseSortedArray() {
        int[] revSorted = {20, 18, 12, 8, 5, -2};
        int[] expected = {-2, 5, 8, 12, 18, 20};
        quickSort(revSorted, 0, revSorted.length - 1);
        assertArrayEquals("should return sorted array after calling quickSort on reverse sorted array", expected, revSorted);
    }

    @Test
    public void testQuickSortFewUniques() {
        int[] fewUniques = {5, 12, 7, 5, 5, 7};
        int[] expected = {5, 5, 5, 7, 7, 12};
        quickSort(fewUniques, 0, fewUniques.length - 1);
        assertArrayEquals("should return sorted array after calling quickSort on reverse sorted array", expected, fewUniques);
    }

    @Test
    public void testQuickSortNearlySorted() {
        int[] nearlySorted = {2, 3, 5, 7, 13, 11};
        int[] expected = {2, 3, 5, 7, 11, 13};
        quickSort(nearlySorted, 0, nearlySorted.length - 1);
        assertArrayEquals("should return sorted array after calling quickSort on reverse sorted array", expected, nearlySorted);
    }
}