public class PreOrderTriversal {
    public static void sol(node tree){
        if(tree == null){
            return;
        }
        System.out.print(tree.data + ", ");

        sol(tree.left);
        sol(tree.right);
    }

    public static void main(String[] args){
        node root = new node(4);
        root.left = new node(2);
        root.right = new node(5);
        root.left.left = new node(3);
        root.right.left = new node(7);
        root.left.left.right = new node(9);

        sol(root);
    }
}
