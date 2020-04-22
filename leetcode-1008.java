class Solution {
    /*
     * Give the function a bound the maximum number it will handle. The left
     * recursion will take the elements smaller than node.val The right recursion
     * will take the remaining elements smaller than bound
     * 
     * It will work because pre-order traversal works in such a way that left part
     * contains left and right part contains right subtree from root from a
     * particular split point
     * 
     * Also remember, for a valid binary search tree, a left subtree should not
     * contain values greater than parent, and a right subtree should not contain
     * values less than parent
     */
    private int idx = 0;
    private int[] arr;

    public TreeNode bstFromPreorder(int[] preorder) {
        this.arr = preorder;
        return helper(Integer.MAX_VALUE);
    }

    private TreeNode helper(int bound) {
        if (idx == this.arr.length || this.arr[idx] > bound)
            return null;

        TreeNode node = new TreeNode(this.arr[idx++]);
        node.left = helper(node.val);
        node.right = helper(bound);

        return node;
    }
}