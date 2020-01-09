public class BinarySearch {
  public static void main (String[] args) {
    System.out.println("Code Challenge 3: Binary Search Array");

    int[] testArray = {1, 2, 3, 4, 5, 6, 7};
    int yld = binarySearch(testArray, 3);
    System.out.println(yld);
  }

  public static int binarySearch(int[] arr, int target) {
    if (arr.length < 1 || target < arr[0] || target > arr[arr.length - 1]) {
      return -1;
    }

    int leftBorder = 0;
    int rightBorder = arr.length - 1;
    
    while(rightBorder > leftBorder) {
      int mid = (rightBorder - leftBorder) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      if (target < mid) {
        rightBorder = mid;
        binarySearch(mySlice(arr, leftBorder, rightBorder), target);
        // System.out.print(mySlice(arr, leftBorder, rightBorder));
        // return -99;
      }
      if (target > mid) {
        leftBorder = mid;
        binarySearch(mySlice(arr, leftBorder, rightBorder), target);
        // System.out.println(mySlice(arr, leftBorder, rightBorder));
        // return 99;
      }
      // System.out.println(leftBorder);
      // System.out.println(rightBorder);
      // leftBorder++;
    }
    return -33;
  }

  public static int[] mySlice(int[] arr, int start, int end) {
    int distance = end - start;
    int[] slicedArray = new int[distance + 1];
    for(int i = 0; i <= distance; i++) {
      slicedArray[i] = arr[start + i];
    }
  
    return slicedArray;
  }
}