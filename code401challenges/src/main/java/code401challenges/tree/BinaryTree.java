package code401challenges.tree;

import java.util.ArrayList;

// Cracking the Coding Interview was referenced for this assignment
// https://stackoverflow.com/questions/27886116/how-to-return-an-arraylist-with-an-recursive-function was referenced for this assignment
// https://www.youtube.com/watch?v=oSWTXtMglKE&feature=youtu.be was referenced for this assignment
// https://github.com/sergeyvoytov/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/tree/BinaryTree.java was referenced for this assignment

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {}

    public BinaryTree(TreeNode treeNode) {
        this.root = treeNode;
    }

    public ArrayList<Integer> preOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        return preOrder(this.root, list);
    }

    public ArrayList<Integer> preOrder(TreeNode node, ArrayList<Integer> list) {
        if (node != null) {
            list.add(node.value);
            preOrder(node.left, list);
            preOrder(node.right, list);
        }
        return list;
    }

    public ArrayList<Integer> inOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        return inOrder(this.root, list);
    }

    public ArrayList<Integer> inOrder(TreeNode node, ArrayList<Integer> list) {
        if (node != null) {
            inOrder(node.left, list);
            list.add(node.value);
            inOrder(node.right, list);
        }
        return list;
    }

    public ArrayList<Integer> postOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        return postOrder(this.root, list);
    }

    public ArrayList<Integer> postOrder(TreeNode node, ArrayList<Integer> list) {
        if (node != null) {
            postOrder(node.left, list);
            postOrder(node.right, list);
            list.add(node.value);
        }
        return list;
    }
}
