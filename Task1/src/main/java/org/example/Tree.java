package org.example;

public class Tree {

    private int length = 0;
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }

    // Counts the number of leaf nodes in the tree
    public int countLeafNodes() {
        if(root == null){
            return 0;
        }
        length = countLeafNodess(this.root);
        return length;
    }

    // Helper function to recursively count the number of leaf nodes
    private int countLeafNodess(Node node) {
        if (node.left == null &&  node.right == null) {
            return 1;
        }
        int count = 0;
        if (node.left != null) {
            count += countLeafNodess(node.left);
        }
        if (node.right != null) {
            count += countLeafNodess(node.right);
        }
        return count;
    }

    // Gets the length of the longest path from the root to a leaf node
    public int getMaxPathLength() {
        if(root ==null){
            return 0;
        }
        return getMaxPathLength(this.root);
    }

    // Helper function to recursively get the maximum path length
    private int getMaxPathLength(Node node) {
        if (node.left == null &&  node.right == null) {
            return 0;
        }
        int maxPathLength = 0;
        if (node.left != null) {
            int childPathLength = getMaxPathLength(node.left);
            if (childPathLength > maxPathLength) {
                maxPathLength = childPathLength;
            }
        }
        if (node.right != null) {
            int childPathLength = getMaxPathLength(node.right);
            if (childPathLength > maxPathLength) {
                maxPathLength = childPathLength;
            }
        }
        return maxPathLength + 1;
    }

    // Adds a node with the given value as a child of the node with the given parent value
    public void addNodeWithValue(int valueToAdd, int parentValue) {
        Node parentNode = findNodeWithValue(this.root, parentValue);
        if (parentNode != null) {
            if (parentNode.left == null) {
                parentNode.left = new Node(valueToAdd);
            } else if (parentNode.right == null) {
                parentNode.right = new Node(valueToAdd);
            }
        }
    }

    // Helper function to find the node with the given value
    private Node findNodeWithValue(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (node.value == value && (node.left == null || node.right == null)) {
            return node;
        }
        Node leftResult = findNodeWithValue(node.left, value);
        if (leftResult != null) {
            return leftResult;
        }
        return findNodeWithValue(node.right, value);
    }

    // Checks if two trees are equal (have the same structure and values)
    public static boolean areTreesEqual(Tree tree1, Tree tree2) {
        return areNodesEqual(tree1.getRoot(), tree2.getRoot());
    }

    // Helper function to recursively check if two nodes are equal
    private static boolean areNodesEqual(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.value != node2.value) {
            return false;
        }
        return areNodesEqual(node1.left, node2.left) && areNodesEqual(node1.right, node2.right);
    }

    public void printTree() {
        printTree(this.root);
    }

    private void printTree(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        printTree(node.left);
        printTree(node.right);
    }

}

