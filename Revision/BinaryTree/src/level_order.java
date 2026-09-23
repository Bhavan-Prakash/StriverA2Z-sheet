public class level_order {
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
        Queue<TreeNode> qe = new LinkedList<>();

        if (root == null) {
            return sol;
        }

        qe.add(root);

        while(!qe.isEmpty()){
            int size = qe.size();

            List<Integer> level = new ArrayList<>();

            for(int i = 0; i<size; i++){
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