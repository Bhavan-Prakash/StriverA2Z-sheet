import java.util.ArrayList;

public class Inorder {

    public static void ans(node root, ArrayList<Integer> sol ){
        if(root == null) return;

        ans(root.left, sol);
        sol.add(root.data);
        ans(root.right, sol);
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.right = new node(5);
        root.left = new node(2);
        root.left.left = new node(4);
        root.left.right = new node(3);

        ArrayList<Integer> sol = new ArrayList<>();
        ans(root, sol);
        for(int x : sol){
            System.out.print(x + ", ");
        }
    }
}
