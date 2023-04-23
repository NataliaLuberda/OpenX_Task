package org.example;

public class Node {

    public int value;  // The value stored in this node
    public Node left, right;  // References to the left and right child nodes

    public Node(int value) {  // Constructor to create a new Node object with the given value
        this.value = value;
        left = null;  // Initialize the left child reference to null
        right = null;  // Initialize the right child reference to null
    }
}


