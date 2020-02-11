package code401challenges.utilities;

public class InsertionSort {

    // https://www.geeksforgeeks.org/insertion-sort/
    public static void insertionSort(int[] arr) {
        int end = arr.length;
        for (int i = 1; i < end; i++) {
            int reference = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > reference) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = reference;
        }
    }

    public InsertionSort() {}
}
