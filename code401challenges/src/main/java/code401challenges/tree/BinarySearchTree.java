package code401challenges.tree;

public class BinarySearchTree {

    public TreeNode root;

    public BinarySearchTree() {}

    public BinarySearchTree(TreeNode node) {
        this.root = node;
    }

    public void add(int value) {
        root = add(root, value);
    }

    public TreeNode add(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        } else if (value < node.value) {
            node.left = add(node.left, value);
        } else {
            node.right = add(node.right, value);
        }
        return node;
    }

    public boolean contains(int target) {
        return contains(root, target);
    }

    public boolean contains(TreeNode node, int target) {
        if (node == null) {
            return false;
        }
        if (target == node.value) {
            return true;
        } else if (target < node.value) {
            return contains(node.left, target);
        } else {
            return contains(node.right, target);
        }
    }
}
