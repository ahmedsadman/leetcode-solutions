import java.util.*;

// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int x) {
//         val = x;
//     }
// }

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root.val == x)
            return false;

        Queue<TreeNode> queue = new LinkedList<>();
        boolean found = false; // determines whether the level of x is found
        queue.add(root);

        while (!queue.isEmpty() && !found) {
            int currentSize = queue.size();

            while (currentSize-- > 0) {
                TreeNode node = queue.poll(); // removes head

                if ((node.left != null && node.left.val == x) || (node.right != null && node.right.val == x)) {
                    // if x is found, don't add it's child to the queue
                    found = true;
                } else {
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
        }

        if (found) {
            // the queue contains the cousins, now search for y
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.val == y)
                    return true;
            }
            return false;
        } else
            return false;

    }
}