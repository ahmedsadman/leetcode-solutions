class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    private int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);

        this.max = Math.max(this.max, lDepth + rDepth);

        return Math.max(lDepth, rDepth) + 1;
    }
}