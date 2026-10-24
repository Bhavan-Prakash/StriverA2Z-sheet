package Revision_21oct;

public class binary_tree_preorder_traversal_144 {
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
    public void ans(List<Integer> sol, TreeNode root){
        if(root == null) return;
        sol.add(root.val);
        ans(sol, root.left);
        ans(sol,root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<Integer>();

        ans(sol, root);
        return sol;
    }
}