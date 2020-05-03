class Solution {
    private int ans = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        helper(root, L, R);
        return ans;
    }

    private void helper(TreeNode node, int L, int R) {
        if (node == null)
            return;

        if (node.val >= L && node.val <= R)
            ans += node.val;
        if (node.val > L)
            rangeSumBST(node.left, L, R);
        if (node.val < R)
            rangeSumBST(node.right, L, R);
    }
}