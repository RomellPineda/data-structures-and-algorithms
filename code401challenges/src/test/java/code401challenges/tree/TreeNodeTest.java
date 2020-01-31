package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeNodeTest {

    TreeNode newTreeNode;

    @Before
    public void preTestBuild() {
        newTreeNode = new TreeNode(8);
    }

    @Test
    public void testTreeNodeInstance() {
        assertEquals("should return correct TreeNode value", 8, newTreeNode.value);
    }

    @Test public void testTreeNodeQuickConstructor() {
        TreeNode lTreeNode = new TreeNode(5);
        TreeNode rTreeNode = new TreeNode(99);
        TreeNode root = new TreeNode(42, lTreeNode, rTreeNode);

        assertEquals("should return correct left TreeNode value", 5, root.left.value);
        assertEquals("should return correct right TreeNode value", 99, root.right.value);
    }
}
