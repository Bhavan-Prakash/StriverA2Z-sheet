public class maximum_depth {
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

        Queue<TreeNode> qe = new LinkedList<>();
        List<List<Integer>> bfs = new ArrayList<>();

        if(root == null){
            return 0;
        }

        qe.add(root);


        while(!qe.isEmpty()){
            int size = qe.size();
            List<Integer> level = new LinkedList<>();

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

            bfs.add(level);
        }

        // int ans = bfs.length();
        return bfs.size();

    }
}