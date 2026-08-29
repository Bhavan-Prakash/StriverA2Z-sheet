public class Insert_a_given_node {
    public static Tree sol(Tree root, int val){
        if(root == null) return new Tree(val);

        Tree curr = root;
        while(true){
            if(curr.data <= val){
                if(curr.right != null) curr = curr.right;
                else {
                    curr.right = new Tree(val);
                    break;
                }
            }else{
                if(curr.left != null) curr = curr.left;
                else{
                    curr.left = new Tree(val);
                    break;
                }
            }
        }
        return root;
    }
}
