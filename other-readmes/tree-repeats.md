# Tree Repeats

[link to code](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/TreeIntersection/TreeIntersection.java)

[link to tests](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/TreeIntersection/TreeIntersectionTest.java)

## Challenge
Design a method that returns an array of values that are stored in two separate binary trees.

## Approach & Efficiency
Utilize a hashmap to keep a record of the values that are stored in one of the binary trees.  Account for any repeat values that may be stored in the same binary tree.  Traverse through the second binary tree and increment the value of any repeated keys.  Iterate through the map and push any incremented values into an output array then return the array.

Time complexity: O(n) due to non-nested traversals of entire data structures.
Space complexity: O(n) due to creation of additional data structures based on size of input structures and potential for need to storing entire data sets into new structure.

## Solution
![whiteboard solution](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/assets/code33.jpg)