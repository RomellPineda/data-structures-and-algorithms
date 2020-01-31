package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BinarySearchTreeTest {

    BinarySearchTree tree;

    @Before
    public void preTestBuild() {
        tree = new BinarySearchTree();
        tree.add(57);
        tree.add(81);
        tree.add(37);
        tree.add(12);
        tree.add(75);
        tree.add(42);
        tree.add(99);
        tree.add(3);
    }

    @Test
    public void testBinaryTreeBuild() {
        // add method suspect
        System.out.println(tree.contains(37));
    }
}
