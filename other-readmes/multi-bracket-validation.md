# Multi Bracket Validation

[link to code](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/utilities/MultiBracketValidation.java)

[link to tests](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/utilities/MultiBracketValidationTest.java)

## Challenge
Create method for validating a string for proper bracket usage.

## Approach & Efficiency
Time: O(n)
Space: O(1)
Split input string on every character.  Iterate through string array, if character is a open or close bracket, push into stack.  During iterations compare bracket to last bracket in stack if bracket closes the last item in stack, pop item.  Return stack size equal to zero.

## Solution
![whiteboard solution](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/assets/code13.jpg)