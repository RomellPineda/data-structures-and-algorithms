# Binary Tree and Binary Search Tree

[link to code](https://github.com/RomellPineda/data-structures-and-algorithms/code401challenges/src/main/java/code401challenges/tree)

[link to tests](https://github.com/RomellPineda/data-structures-and-algorithms/code401challenges/src/test/java/code401challenges/tree)

## Challenge
Construct a tree node, binary tree, and binary search tree

## Approach & Efficiency
Time: O(log n) for balanced binary search tree and O(n) for binary tree.
Space: O(n)
Created a node with data value, left, and right pointers.  Created a tree that takes in generics as well as a tree that only takes in integers.

## API
BinaryTree Methods:
- preOrder() returns an ArrayList of values contained in the tree from the root element to the branch elements.
- inOrder() returns an ArrayList of values contained in the tree from the left element to the root and right branch elements.
- postOrder() returns an ArrayList of values contained in the tree from the branch elements to the root.

BinarySearchTree Methods:
- add(int value) inserts a given value into a binary search tree in numerical order.
- contains(int value) returns a boolean corresponding to whether a tree contain a given value or not.
