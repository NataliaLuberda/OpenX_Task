import org.example.Node;
import org.example.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class treeTest {
    @Test
    public void LackOfChildren() {

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


        tree.addNodeWithValue(5,8);
        assertEquals(tree.countLeafNodes(),5);

        Tree treeNull = new Tree(null);
        assertEquals(treeNull.countLeafNodes(), 0);


        Node node = new Node(6);
        Tree treeOne = new Tree(node);
        assertEquals(treeOne.countLeafNodes(), 1);

    }

    @Test
    public void pathLength() {
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


        tree.addNodeWithValue(5,8);
        assertEquals(tree.getMaxPathLength(),4);

        Tree treeNull = new Tree(null);
        assertEquals(treeNull.getMaxPathLength(), 0);


        Node node = new Node(6);
        Tree treeOne = new Tree(node);
        assertEquals(treeOne.getMaxPathLength(), 0);

    }

    @Test
    public void equalsTree() {
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


        tree.addNodeWithValue(5,8);
        assertEquals(Tree.areTreesEqual(tree,tree),true);

        Tree treeNull = new Tree(null);
        assertEquals(Tree.areTreesEqual(treeNull,tree), false);


        Node node = new Node(6);
        Tree treeOne = new Tree(node);
        assertEquals(Tree.areTreesEqual(treeOne,tree),false);

    }
}