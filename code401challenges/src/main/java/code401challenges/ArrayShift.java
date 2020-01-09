import java.util.Arrays;

public class ArrayShift {
  public static void main (String[] args) {
    int[] inputArray = {1, 2, 3, 4, 5};
    int[] outputArray = insertShiftArray(inputArray, 99);
    
    System.out.println(Arrays.toString(inputArray));
    System.out.println(Arrays.toString(outputArray));

  }

  public static int[] insertShiftArray(int[] arr, int num) {
    int[] yld = new int[arr.length + 1];
    int mid = (int) Math.ceil((double) arr.length / 2);
    for (int i = 0; i < arr.length; i++) {
      if (i < mid) {
        yld[i] = arr[i];
      }
      yld[mid] = num;
      if (i >= mid) {
        yld[i + 1] = arr[i];
      }
    }
    return yld;
  }
}