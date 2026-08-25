package Normal_level;

import java.util.ArrayList;
import java.util.Stack;

public class Post_order_by_2_stack {
    public static void main(String[] args){
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right = new Tree(3);
        root.right.left = new Tree(6);
        root.right.left.right = new Tree(7);
        root.right.left.right.left = new Tree(8);

        Stack<Tree> st1 = new Stack<>();
        Stack<Tree> st2 = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();

        st1.add(root);

        while(!st1.empty()){
            Tree current = st1.pop();
            st2.add(current);
//            answer.add(current.data);
            if(current.left != null){
                st1.add(current.left);
            }
            if(current.right != null){
                st1.add(current.right);
            }
        }

        while (!st2.empty()){
            Tree temp = st2.pop();
            answer.add(temp.data);
        }

        for (int x : answer){
            System.out.print(x + " ");
        }
    }


}
