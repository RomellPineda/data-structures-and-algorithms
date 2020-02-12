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

    public static List<Integer> mergeSort(List<Integer> arr) {
        if (arr.size() == 1) {
            return arr;
        }
        int mid = (int) Math.floor(arr.size() / 2.0);
        List<Integer> left = arr.subList(0, mid);
        List<Integer> right = arr.subList(mid, arr.size() - 1);
        return merge(left, right);
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        int l = 0;
        int r = 0;
        List<Integer> arr;

        while (l < left.size() && r < right.size()) {
            if (left.indexOf(l) < right.indexOf(r)) {
                arr.add(left.indexOf(l));
                l++;
            } else {
                arr.add(right.indexOf(r));
                r++;
            }
        }
//        if (l == left.size()) {
//            arr = arr.addAll(right.subList(r, right.size() - 1));
//        } else {
//            arr = arr.addAll(left.subList(r, left.size() - 1));
//
//        }
        return arr;
    }
}
