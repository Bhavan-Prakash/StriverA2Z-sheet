package Revision_21oct;

public class binary_tree_level_order_traversal_102 {
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
    public List<List<Integer>> levelOrder(TreeNode root) {


        List<List<Integer>> sol = new ArrayList<>();

        if (root == null) {
            return sol;
        }

        Queue<TreeNode> qe = new LinkedList<>();

        qe.add(root);

        while(!qe.isEmpty()){
            int n = qe.size();


            List<Integer> level = new ArrayList<>();

            for(int i = 0; i<n; i++){
                TreeNode temp = qe.poll();

                level.add(temp.val);

                if(temp.left != null){
                    qe.add(temp.left);
                }

                if(temp.right != null){
                    qe.add(temp.right);
                }
            }

            sol.add(level);
        }
        return sol;


    }
}