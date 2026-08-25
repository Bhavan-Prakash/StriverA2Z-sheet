package Medium_level;

class sol{
    public int height(Tree root){

        if(root == null) return 0;

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight, rightheight) + 1;

    }
}

public class Balanced_Binary_Tree {

    public static void main(String[] args){
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        sol sl = new sol();
        int ans = sl.height(root);
        if(ans > 1){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }

}
