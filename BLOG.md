# Sorting Algorithms

### Insertion Sort

[link to code](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/utilities/Sort.java)

[link to tests](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/utilities/SortTest.java)

Insertion sort is one of the classic sorting algorithms which include selection sort, bubble sort, quick sort, and merge sort.  One of the key features of insertion sort is that it places an imaginary divider after the first element of the array to be sorted.  The divider splits the array into a sorted section and unsorted section.  The first element is considered to be sorted since it is the only value in the sorted section.  The remaining elements of the array are assessed individually and place in the appropriate location of the sorted array before the algorithm progresses to the next element in the array.

The Big O for insertion sort runtime is O(n) due to the nested loops.  The nested loop must iterate through the length of the array and is dependent on the operation of the outer array which must also iterate through the length of the array.

*Walk Through*
>![insertion sort](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/assets/code26.jpg)

### Merge Sort

[link to code](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/utilities/Sort.java)

[link to tests](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/utilities/SortTest.java)

Merge sort provides optimal time performance while sacrificing space complexity.  Merge sort divides the input array into two arrays and recursively sorts the separate arrays before merging them together.

The Big O time complexity for merge sort is O(n log(n)).  Space complexity is O(n) due the creation of an additional helper array.

*Walk Through*
>![merge sort](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/assets/code27.jpg)