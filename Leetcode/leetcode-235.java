/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = lca_recursion(root, p.val, q.val);
        return node;
    }

    public TreeNode lca_recursion(TreeNode node, int p, int q) {
        if (node == null)
            return null;

        if (p < node.val && q < node.val) {
            return lca_recursion(node.left, p, q);
        } else if (p > node.val && q > node.val) {
            return lca_recursion(node.right, p, q);
        }

        return node;
    }
}