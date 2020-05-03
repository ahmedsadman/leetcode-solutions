/*
First of all, let's simplify the problem and implement a function max_gain(node) which takes a node as an argument and computes a maximum contribution that this node and one/zero of its subtrees could add.

Now everything is ready to write down an algorithm:


- Initiate max_sum as the smallest possible integer and call max_gain(node = root).
- Implement max_gain(node) with a check to continue the old path/to start a new path:
-- Base case : if node is null, the max gain is 0.

-- Call max_gain recursively for the node children to compute max gain from the left and right subtrees : left_gain = max(max_gain(node.left), 0) and
right_gain = max(max_gain(node.right), 0).

-- Now check to continue the old path or to start a new path. To start a new path would cost price_newpath = node.val + left_gain + right_gain. Update max_sum if it's better to start a new path.

-- For the recursion return the max gain the node and one/zero of its subtrees could add to the current path : node.val + max(left_gain, right_gain).
*/

class Solution {
    private int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        
        max_gain(root);
        return maxSum;
    
    }
    
    private int max_gain(TreeNode node) {
        if (node == null)
            return 0;
        
        int left_gain = Math.max(0, max_gain(node.left));
        int right_gain = Math.max(0, max_gain(node.right));
        
        // whether to continue on the current path, or start a new path
        maxSum = Math.max(maxSum, left_gain + right_gain + node.val);
        
        return node.val + Math.max(left_gain, right_gain);
    }
}