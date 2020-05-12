class Solution {
    private int sum = 0;
    private int maxDepth = 0;

    public int deepestLeavesSum(TreeNode root) {
        helper(root, 0);
        return sum;
    }

    private void helper(TreeNode node, int depth) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            if (depth > this.maxDepth) {
                this.maxDepth = depth;
                sum = node.val; // reset the sum to this level
            } else if (depth == this.maxDepth) {
                sum += node.val;
            }
        }

        helper(node.left, depth + 1);
        helper(node.right, depth + 1);
    }
}