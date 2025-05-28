class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) return null;

        // If the node is found in the original, return the corresponding cloned node
        if (original == target) return cloned;

        // Search in the left subtree
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null) return left;

        // If not found in left, search in right subtree
        return getTargetCopy(original.right, cloned.right, target);
    }
}
