package code401challenges.utilities;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    // https://www.geeksforgeeks.org/insertion-sort/
    public static int[] insertionSort(int[] arr) {
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
        return arr;
    }

    // Cracking the Coding Interview - Gayle Laakman McDowell
    public static void mergeSort(int[] arr) {
        int[] magazine = new int[arr.length];
        mergeSort(arr, magazine, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] mag, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, mag, low, mid);
            mergeSort(arr, mag, mid + 1, high);
            merge(arr, mag, low, mid, high);
        }
    }

    public static void merge(int[] arr, int[] mag, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            mag[i] = arr[i];
        }

        int left = low;
        int right = mid + 1;
        int current = low;

        while (left <= mid && right <= high) {
            if (mag[left] <= mag[right]) {
                arr[current] = mag[left];
                left++;
            } else {
                arr[current] = mag[right];
                right++;
            }
            current++;
        }

        int loadOut = mid - left;
        for (int i = 0; i <= loadOut; i++) {
            arr[current + i] = mag[left + i];
        }
    }

    // Cracking the Coding Interview - Gayle Laakman McDowell
    public static void quickSort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                switcheroo(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void switcheroo(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
