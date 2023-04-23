
# OpenX Tasks

I have chosen Task 1, which requires creating a data structure to represent a given model with integer values. 


## Introduction
The task also includes implementing functions to calculate the number of leaf nodes (nodes without children), finding the longest path from the root node to a leaf node, and checking the equivalence of two instances of the data structure based on their node values and children. The solution should also include a set of tests to ensure its correctness.


##  Description
### The Tree class has several methods to operate on a binary tree data structure.

* The printTree() method takes in a Node object representing the root of the tree and prints the values of all nodes in the tree using a pre-order traversal (root, left, right).
* The getRoot() method returns the root node of the tree.
* The countLeafNodes() method returns the number of leaf nodes in the tree. A leaf node is defined as a node with no children (left or right).
* The getMaxPathLength() method returns the maximum number of edges in a path from the root node to a leaf node.
* The addNodeWithValue() method takes in two integers representing the value to add and the value of the parent node. It searches for the parent node with the specified value and adds the new node as its child (left or right) if it has a free slot.
* The areTreesEqual() method takes in two Tree objects and checks if they are equivalent by comparing the values and structure of their nodes.
* There are also private helper methods in the Tree class, such as countLeafNodess(), getMaxPathLength(), findNodeWithValue(), and areNodesEqual(), which are used by the public methods to perform their respective tasks.

### This is the Node class, which represents a node in a binary tree. It has three public fields: 
* "value" holds the integer value of the node,
* "left" and "right" are references to the left and right child nodes, respectively. 
* The constructor takes an integer parameter and initializes the "value" field to that value, while setting both the "left" and "right" references to null by default.