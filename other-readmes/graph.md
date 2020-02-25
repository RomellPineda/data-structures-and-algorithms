# Graphs
Homemade implementation of graph data structure featuring generic input type.

## Challenge
Create a graph data structure that includes addNode, addEdge, size, getNode, getNeighbors methods.

## Approach & Efficiency
Utilized Java HashMap class to store node types as keys and neighbors as an array of node types.

## API
- Utilized addVertex method signature in place of addNode.  Takes in a generic type reference and hashes reference as key in hashmap.
- Utilized getVertices method signature in place of getNode, returns a string of the graph vertices.
- addEdge takes in two references to be linked and a boolean that determines whether edge
- Utilized getAdjacent method signature in place of getNeighbors, returns the associated vertices of a specified vertex.
- size returns the amount of vertices.
- breadthFirstTraversal takes in a single vertex and traverses through the adjacent vertices in breadth first order returning a collection of vertices.

## Breadth First Solution
![breadthFirstTraversal](https://github.com/RomellPineda/data-structures-and-algorithms/blob/master/assets/code36.jpg)