# Repeating Word

[link to code](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/BinarySearch.java)

[link to tests](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/BinarySearchTest.java)

Given an array and a target value as inputs, write a Java function that will return the index of the target value found within the array or -1 if the array does not contain the target value.

## Challenge
Write a function which takes an array and a target value as inputs, write a Java function that will return the index of the target value found within the array or -1 if the array does not contain the target value.

## Approach & Efficiency
Find the midpoint of an array and determine if the target is stored at that index.  If so, return the midpoint.  Other wise check to the left of the midpoint if the target value is less than the midpoint or to the right of the midpoint if the target value is greater. Repeat until the target is eventually found or the array cannot be searched further.  Maximum time complexity O(log n).

## Solution
![whiteboard solution](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/assets/code32.jpg)
