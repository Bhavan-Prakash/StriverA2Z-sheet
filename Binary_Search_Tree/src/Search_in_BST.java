public class Search_in_BST {
    private static Tree sol(Tree node, int val){
        if(node.data < val){
            return node;
        }
        while (node.data != val){
            node = val< node.data? node.left : node.right;
        }
        return node;
    }

    public static void main(String[] args){
        Tree root = new Tree(8);
        root.left = new Tree(5);
        root.right = new Tree(12);
        root.left.left = new Tree(4);
        root.left.right = new Tree(7);
        root.right.left = new Tree(10);
        root.right.right = new Tree(14);
        Tree ans = sol(root,22);

        if(ans.data == 7){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
