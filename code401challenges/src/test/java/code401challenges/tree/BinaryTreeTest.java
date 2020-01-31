package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BinaryTreeTest {

    BinaryTree<String> tree;
    Node<String> stringNode;
    Node<String> leftNode;
    Node<String> rightNode;

    @Before
    public void preTestBuild() {
        tree = new BinaryTree<>();
        stringNode = new Node<>("frenchFry");
        leftNode = new Node<>("pineapple");
        rightNode = new Node<>("spongeBob");
    }

    @Test
    public void testBinaryTreeBuild() {
        tree.root = stringNode;
        assertEquals("should return correct root data", "frenchFry", tree.root.data);
        assertNull("should return correct left node data", tree.root.left);
        assertNull("should return correct right node data", tree.root.right);
    }

    @Test
    public void testBinaryTreeConstructor() {
        BinaryTree<String> constructedTree = new BinaryTree<>(stringNode);
        assertEquals("should return correct root data", "frenchFry", constructedTree.root.data);
        assertNull("should return correct left node data", constructedTree.root.left);
        assertNull("should return correct right node data", constructedTree.root.right);
    }

    @Test
    public void testBinaryTreeStructure() {
        stringNode.left = leftNode;
        stringNode.right = rightNode;
        tree.root = stringNode;
        assertEquals("should return correct root data", "pineapple", tree.root.left.data);
        assertEquals("should return correct root data", "spongeBob", tree.root.right.data);
    }

    @Test
    public void testPreOrderMethod() {
        stringNode.left = leftNode;
        stringNode.right = rightNode;
        tree.root = stringNode;
        ArrayList<String> results = new ArrayList<>();
        results.add("frenchFry");
        results.add("pineapple");
        results.add("spongeBob");
        assertEquals("should return string array with correct order", results, tree.preOrder());
    }

    @Test
    public void testInOrderMethod() {
        stringNode.left = leftNode;
        stringNode.right = rightNode;
        tree.root = stringNode;
        ArrayList<String> results = new ArrayList<>();
        results.add("pineapple");
        results.add("frenchFry");
        results.add("spongeBob");
        assertEquals("should return string array with correct order", results, tree.inOrder());
    }

    @Test
    public void testPostOrderMethod() {
        stringNode.left = leftNode;
        stringNode.right = rightNode;
        tree.root = stringNode;
        ArrayList<String> results = new ArrayList<>();
        results.add("pineapple");
        results.add("spongeBob");
        results.add("frenchFry");
        assertEquals("should return string array with correct order", results, tree.postOrder());
    }
}
