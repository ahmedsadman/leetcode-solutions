
/**
 * Definition for a binary tree node.
*/

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        // depth first search
        Stack<TreeNode> nodes = new Stack<>();
        int result = 0;

        TreeNode current;
        nodes.push(root);

        while (!nodes.isEmpty()) {
            current = nodes.pop();
            if (current != null) {
                if (current.val >= L && current.val <= R)
                    result += current.val;

                if (current.right != null)
                    nodes.push(current.right);

                if (current.left != null)
                    nodes.push(current.left);
            }

        }

        return result;
    }
}