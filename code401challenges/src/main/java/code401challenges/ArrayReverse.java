package code401challenges;

import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }
  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    // your code goes here!
    for (int i = 0; i < Math.floor(inputArray.length / 2); i++) {
      int temp = inputArray[i];
      inputArray[i] = inputArray[inputArray.length - 1 - i];
      inputArray[inputArray.length - 1 - i] = temp;
    }
    return inputArray;
  }
}