package Revision_21oct;

public class same_tree_100 {
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
        Queue<TreeNode[]> qe = new LinkedList<>();
        qe.add(new TreeNode[]{p,q});

        while(!qe.isEmpty()){
            TreeNode[] temp = qe.poll();
            TreeNode a = temp[0];
            TreeNode b = temp[1];

            if(a == null && b == null) continue;
            if(a == null || b == null) return false;
            if(a.val != b.val) return false;

            qe.add(new TreeNode[] {a.left, b.left});
            qe.add(new TreeNode[] {a.right, b.right});

        }

        return true;

    }
}