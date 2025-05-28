class Solution {
    public boolean evaluateTree(TreeNode root) {
        // Base case: leaf node
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        if (root.val == 2) { // OR operation
            return left || right;
        } else { // AND operation (val == 3)
            return left && right;
        }
    }
}
