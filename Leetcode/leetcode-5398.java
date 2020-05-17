class Solution {
    private int count;

    public int goodNodes(TreeNode root) {
        helper(root.val, root);
        return count;
    }

    private void helper(int x, TreeNode node) {
        if (node == null)
            return;

        if (node.val >= x)
            count++;

        helper(Math.max(x, node.val), node.left);
        helper(Math.max(x, node.val), node.right);
    }
}