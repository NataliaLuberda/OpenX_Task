package org.example;

public class Main {

    public static Tree makingTree(){
        Node node1 = new Node(5);
        Tree tree = new Tree(node1);

        tree.addNodeWithValue(3,5);
        tree.addNodeWithValue(7,5);

        tree.addNodeWithValue(2,3);
        tree.addNodeWithValue(5,3);


        tree.addNodeWithValue(1,7);
        tree.addNodeWithValue(0,7);


        tree.addNodeWithValue(2,0);
        tree.addNodeWithValue(8,0);

        return tree;
    }

    public static void main(String[] args) {
        Tree newTree = makingTree();
        newTree.printTree();
        System.out.print("Root has value " + newTree.getRoot().value);

    }
}