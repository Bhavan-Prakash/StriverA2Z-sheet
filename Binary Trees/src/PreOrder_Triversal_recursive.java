import java.util.ArrayList;

class Node_pre{
    Node_pre right;
    Node_pre left;
    int data;

    Node_pre(int value){
        data = value;
        left = null;
        right = null;
    }
}

class sol{
    public ArrayList<Integer> ans(Node_pre root, ArrayList<Integer> arr){
        if(root == null){
            return arr;
        }

        arr.add(root.data);
        ans(root.left, arr);
        ans(root.right, arr);
        return arr;
    }
}

public class PreOrder_Triversal_recursive {
    public static void main(String[] args){
        // Creating a sample binary tree
        Node_pre root = new Node_pre(1);
        root.left = new Node_pre(2);
        root.right = new Node_pre(3);
        root.left.left = new Node_pre(4);
        root.left.right = new Node_pre(5);

        ArrayList<Integer> temp = new ArrayList<>();

        sol preorder = new sol();
        ArrayList<Integer> solution = preorder.ans(root, temp);

        for(int x : solution){
            System.out.print(x + " ");
        }
    }
}
