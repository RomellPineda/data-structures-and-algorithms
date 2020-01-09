# Shift an Array
[link to code](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/ArrayShift.java)
Given an array and an integer as inputs, write a Java function that will return a new array with the given integer insert at the midpoint of the array.

## Challenge
Write a function called which takes an array and an integer as arguments. Without utilizing any of the built-in methods available to Java, return an a new array with the given integer insert at the midpoint of the array.

## Approach & Efficiency
Create a new array of integers. Establish the midpoint of the original array.  Insert the element of the old array into the new one up until the midpoint.  Insert the integer given as the second argument into the midpoint of the new array.  Then insert the remaining elements from the original array.

## Solution
![whiteboard solution](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/assets/array-shift.jpg)
