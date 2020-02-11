package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    }

    @Test
    public void testBinaryTreeConstructor() {
        TreeNode x = new TreeNode(100);
        BinarySearchTree test = new BinarySearchTree(x);
        assertEquals("should return correct root value of constructed tree", 100, test.root.value);
    }

    @Test
    public void testBinaryTreeAdd() {
        assertEquals("should return correct leaf value of tree", 75, tree.root.right.left.value);
        assertEquals("should return correct leaf value of tree", 42, tree.root.left.right.value);
    }

    @Test
    public void testBinaryTreeContains() {
        assertTrue("should return true for value contained in tree", tree.contains(42));
        assertTrue("should return true for value contained in tree", tree.contains(99));
        assertFalse("should return false for value not contained in tree", tree.contains(88));
    }
}
