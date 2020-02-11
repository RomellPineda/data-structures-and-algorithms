* Insertion Sort

[link to code](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/utilities/InsertionSort.java)

[link to tests](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/utilities/InsertionSortTest.java)

Insertion sort is one of the classic sorting algorithms which include selection sort, bubble sort, quick sort, and merge sort.  One of the key features of insertion sort is that it places an imaginary divider after the first element of the array to be sorted.  The divider splits the array into a sorted section and unsorted section.  The first element is considered to be sorted since it is the only value in the sorted section.  The remaining elements of the array are assessed individually and place in the appropriate location of the sorted array before the algorithm progresses to the next element in the array.

The Big O for insertion sort runtime is O(n) due to the nested loops.  The nested loop must iterate through the length of the array and is dependent on the operation of the outer array which must also iterate through the length of the array.