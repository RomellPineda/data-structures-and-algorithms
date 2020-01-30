package code401challenges.tree;

import java.util.ArrayList;

// Cracking the Coding Interview was referenced
// https://stackoverflow.com/questions/27886116/how-to-return-an-arraylist-with-an-recursive-function was referenced
// https://www.youtube.com/watch?v=oSWTXtMglKE&feature=youtu.be was referenced
// https://github.com/sergeyvoytov/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/tree/BinaryTree.java was referenced

public class BinaryTree<E> {
    Node<E> root;

    public BinaryTree() {}

    public BinaryTree(Node<E> node) {
        this.root = node;
    }

    public ArrayList<E> preOrder() {
        ArrayList<E> list = new ArrayList<>();
        return preOrder(this.root, list);
    }

    public ArrayList<E> preOrder(Node<E> node, ArrayList<E> list) {
        if (node != null) {
            list.add(node.data);
            preOrder(node.left, list);
            preOrder(node.right, list);
        }
        return list;
    }

    public ArrayList<E> inOrder() {
        ArrayList<E> list = new ArrayList<>();
        return inOrder(this.root, list);
    }

    public ArrayList<E> inOrder(Node<E> node, ArrayList<E> list) {
        if (node != null) {
            inOrder(node.left, list);
            list.add(node.data);
            inOrder(node.right, list);
        }
        return list;
    }

    public ArrayList<E> postOrder() {
        ArrayList<E> list = new ArrayList<>();
        return postOrder(this.root, list);
    }

    public ArrayList<E> postOrder(Node<E> node, ArrayList<E> list) {
        if (node != null) {
            postOrder(node.left, list);
            postOrder(node.right, list);
            list.add(node.data);
        }
        return list;
    }
}
