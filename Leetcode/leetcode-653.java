import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();

        // using bfs
        queue.add(root);

        while (!queue.isEmpty()) {
            // null means that the current node has no children
            // this does not refer to the queue being actually empty
            if (queue.peek() != null) {
                TreeNode node = queue.remove();

                if (set.contains(k - node.val))
                    return true;

                set.add(node.val);
                queue.add(node.right);
                queue.add(node.left);
            } else
                queue.remove(); // if no child, then remove it from queue. otherwise it will cause TLE
        }

        return false;
    }
}