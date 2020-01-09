public class BinarySearch {
  public static void main (String[] args) {
    System.out.println("Code Challenge 3: Binary Search Array");

    int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int yld = binarySearch(testArray, 8);
    System.out.println(yld);
  }

  public static int binarySearch(int[] arr, int target) {
    if (arr.length <= 1 || target < arr[0] || target > arr[arr.length - 1]) {
      return -1;
    }

    int leftBorder = 0;
    int rightBorder = arr.length - 1;
    
    while(rightBorder > leftBorder) {
      int mid = (rightBorder - leftBorder) / 2;
      if (arr[mid] == target) {
        return 100;
      }
      if (target < mid) {
        rightBorder = mid;
        return binarySearch(mySlice(arr, leftBorder, rightBorder), target);
      }
      if (target > mid) {
        leftBorder = mid;
        return binarySearch(mySlice(arr, leftBorder, rightBorder), target);
      }
    }

    return -99;
  }

  public static int[] mySlice(int[] arr, int start, int end) {
    if(arr.length == 1) {
      return arr;
    }

    int distance = end - start;
    int[] slicedArray = new int[distance + 1];

    for(int i = 0; i <= distance; i++) {
      slicedArray[i] = arr[start + i];
    }
    return slicedArray;
  }
}