package code401challenges.tree;

public class BinarySearchTree {

    public TreeNode root;

    public BinarySearchTree() {}

    public BinarySearchTree(TreeNode node) {
        this.root = node;
    }

    public void add(int value) {
        root = add(this.root, value);
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
        return contains(this.root, target);
    }

    public boolean contains(TreeNode node, int target) {
        if (node != null && target == node.value) {
            return true;
        } else if (node != null && target < node.value) {
            contains(node.left, target);
        } else if (node != null){
            contains(node.right, target);
        }
        return false;
    }
}
