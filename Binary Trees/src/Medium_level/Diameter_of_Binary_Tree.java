package Medium_level;

public class Diameter_of_Binary_Tree {
    private static int height(Tree root){

        if(root == null) return 0;

        int left_height = height(root.left);
        int right_height = height(root.right);

        return Math.max(left_height, right_height) + 1;
    }

    private static int diameter(Tree root){
        if(root == null) return 0;

        int left_height = diameter(root.left);
        int right_height = diameter(root.right);

        int diameter_from_root = height(root.left)+height(root.right);

        return Math.max(Math.max(left_height, right_height), diameter_from_root);
    }

    public static void main(String[] args){
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        System.out.println(diameter(root));
    }
}
