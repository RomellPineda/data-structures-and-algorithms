package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeNodeTest {

    @Test
    public void testTreeNodeInstance() {
        TreeNode newTreeNode = new TreeNode(8);
        assertEquals("should return correct TreeNode value", 8, newTreeNode.data);
    }

    @Test public void testTreeNodeQuickConstructor() {
        TreeNode lTreeNode = new TreeNode(5);
        TreeNode rTreeNode = new TreeNode(99);
        TreeNode root = new TreeNode(42, lTreeNode, rTreeNode);

        assertEquals("should return correct left TreeNode value", 5, root.left.data);
        assertEquals("should return correct right TreeNode value", 99, root.right.data);
    }
}
