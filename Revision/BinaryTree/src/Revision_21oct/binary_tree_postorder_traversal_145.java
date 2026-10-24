package Revision_21oct;

public class binary_tree_postorder_traversal_145 {
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void ans(TreeNode root, List<Integer> sol){
        if(root == null) return;

        ans(root.left, sol);
        ans(root.right, sol);
        sol.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> solution = new ArrayList<>();

        ans(root, solution);
        return solution;
    }
}