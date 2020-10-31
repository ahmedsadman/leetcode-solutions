class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int sum) {
        if (node == null)
            return 0;

        int curr_sum = sum * 10 + node.val;

        if (node.left == null && node.right == null)
            return curr_sum;

        return dfs(node.left, curr_sum) + dfs(node.right, curr_sum);
    }
}