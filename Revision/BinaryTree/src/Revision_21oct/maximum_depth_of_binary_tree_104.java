package Revision_21oct;

public class maximum_depth_of_binary_tree_104 {
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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        List<List<Integer>> sol = new ArrayList<>();

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

        return sol.size();

    }
}