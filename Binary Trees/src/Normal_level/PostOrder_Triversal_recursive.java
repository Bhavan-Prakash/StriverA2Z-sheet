package Normal_level;

import java.util.ArrayList;

class Node_post{
    Node_post right;
    Node_post left;
    int data;

    Node_post(int value){
        data = value;
        left = null;
        right = null;
    }
}

class postOrder{
    public ArrayList<Integer> sol (Node_post root, ArrayList<Integer> arr){
        if(root == null) return arr;

        sol(root.left, arr);
        sol(root.right, arr);
        arr.add(root.data);
        return arr;
    }
}


public class PostOrder_Triversal_recursive {
    public static void main(String[] args){
        Node_post root = new Node_post(1);
        root.left = new Node_post(2);
        root.right = new Node_post(3);
        root.left.left = new Node_post(4);
        root.left.right = new Node_post(5);
        root.left.right.left = new Node_post(8);
        root.right.left = new Node_post(6);
        root.right.right = new Node_post(7);
        root.right.right.left = new Node_post(9);
        root.right.right.right = new Node_post(10);

        postOrder ans = new postOrder();
        ArrayList<Integer> sol = ans.sol(root, new ArrayList<Integer>());
        for(int x : sol){
            System.out.print(x + " ");
        }
    }
}
