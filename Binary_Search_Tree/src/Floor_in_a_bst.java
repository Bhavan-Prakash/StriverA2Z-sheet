public class Floor_in_a_bst {

    public static int ans(Tree root, int val){
        int ans = -1;

        while(root != null){
            if(root.data == val){
                return root.data;
            }

            if(root.data > val){
                root = root.left;

            }else{
                val = root.data;
                root = root.right;
            }

        }
        return ans;
    }

    public static void main(String[] args){
        Tree root = new Tree(8);
        root.left = new Tree(5);
        root.right = new Tree(12);
        root.left.left = new Tree(4);
        root.left.right = new Tree(7);
        root.right.left = new Tree(10);
        root.right.right = new Tree(4);

        int sol = ans(root, 10);
        System.out.println(sol);
    }

}
