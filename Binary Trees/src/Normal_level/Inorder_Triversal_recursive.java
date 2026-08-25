package Normal_level;

import java.util.ArrayList;

class Node_in{
    Node_in right;
    Node_in left;
    int data;

    Node_in(int value){
        data = value;
        left = null;
        right = null;
    }
}

class in_order{
    public ArrayList<Integer> sol(Node_in root, ArrayList<Integer> arr){
        if(root == null){
            return arr;
        }

        sol(root.left, arr);
        arr.add(root.data);
        sol(root.right, arr);
        return arr;
    }
}


public class Inorder_Triversal_recursive {

    public static void main(String[] args){
        Node_in root = new Node_in(1);
        root.left = new Node_in(2);
        root.right = new Node_in(3);
        root.left.left = new Node_in(4);
        root.left.right = new Node_in(5);
        root.left.right.left = new Node_in(8);
        root.right.left = new Node_in(6);
        root.right.right = new Node_in(7);
        root.right.right.left = new Node_in(9);
        root.right.right.right = new Node_in(10);

        in_order sol = new in_order();
        ArrayList<Integer> ans = sol.sol(root, new ArrayList<Integer>());

        for(int x : ans){
            System.out.print(x + " ");
        }
    }

}
