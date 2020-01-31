package code401challenges.tree;

public class BinarySearchTree {

    public TreeNode root;

    public BinarySearchTree() {}

    public BinarySearchTree(TreeNode node) {
        this.root = node;
    }

    public void add(int value) {
        add(this.root, value);
    }

    public void add(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
        } else if (value < node.value) {
            add(node.left, value);
        } else {
            add(node.right, value);
        }
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
