package code401challenges;

public class BinarySearch {
  public static void main (String[] args) {
    System.out.println("Code Challenge 3: Binary Search Array");

  }

  public static int binarySearch(int[] arr, int target) {
    if (arr.length == 0 || target > arr[arr.length -1] || target < arr[0]) {
      return -1;
    }

    int lb = 0;
    int rb = arr.length - 1;
    while (rb - lb > 0) {
      int len = (rb - lb) / 2;
      int mid = len + lb;
      if (arr[mid] == target) {
        return mid;
      }
      if (target < arr[mid]) {
        rb = mid;
      }
      if (target > arr[mid]) {
        lb = mid;
      }
    }
    return -1;
  }
//  public static int binarySearch(int[] arr, int target) {
//    if (arr.length <= 1 || target < arr[0] || target > arr[arr.length - 1]) {
//      return -1;
//    }
//
//    int leftBorder = 0;
//    int rightBorder = arr.length - 1;
//
//    while(rightBorder > leftBorder) {
//      int mid = (rightBorder - leftBorder) / 2;
//      if (arr[mid] == target) {
//        return 100;
//      }
//      if (target < mid) {
//        rightBorder = mid;
//        return binarySearch(mySlice(arr, leftBorder, rightBorder), target);
//      }
//      if (target > mid) {
//        leftBorder = mid;
//        return binarySearch(mySlice(arr, leftBorder, rightBorder), target);
//      }
//    }
//
//    return -99;
//  }
//
//  public static int[] mySlice(int[] arr, int start, int end) {
//    if(arr.length == 1) {
//      return arr;
//    }
//
//    int distance = end - start;
//    int[] slicedArray = new int[distance + 1];
//
//    for(int i = 0; i <= distance; i++) {
//      slicedArray[i] = arr[start + i];
//    }
//    return slicedArray;
//  }
}