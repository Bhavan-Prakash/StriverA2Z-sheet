public class SameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> qe = new LinkedList<>();
        List<Integer> vis = new ArrayList<>();

        qe.add(p);
        qe.add(q);

        while(!qe.isEmpty()){
            TreeNode p_prev = qe.poll();
            TreeNode q_prev = qe.poll();

            // Both are null
            if (p_prev == null && q_prev == null) {
                continue;
            }

            // One is null, other isn't
            if (p_prev == null || q_prev == null) {
                return false;
            }

            if(q_prev.val != p_prev.val) return false;

            qe.add(p_prev.left);
            qe.add(q_prev.left);

            qe.add(p_prev.right);
            qe.add(q_prev.right);
        }

        return true;

    }
}