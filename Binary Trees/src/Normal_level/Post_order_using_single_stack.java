package Normal_level;

import java.util.ArrayList;
import java.util.Stack;

public class Post_order_using_single_stack {

    public static void main(String[] args){
        Tree root = new Tree(4);
        root.left = new Tree(2);
        root.left.left = new Tree(3);
        root.left.left.right = new Tree(9);
        root.left.left.right.left = new Tree(1);
        root.right = new Tree(5);
        root.right.left = new Tree(7);
        root.right.right = new Tree(6);
        root.right.right.left = new Tree(8);

        Stack<Tree> st = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();

        st.push(root);
        while(!st.empty()){
            Tree current = st.pop();

            answer.add(current.data);

            if(current.left != null){
                st.push(current.left);
            }

            if(current.right != null){
                st.push(current.right);
            }


        }

        for (int i = answer.size()-1; i >= 0; i--){
            System.out.print(answer.get(i) + " ");
        }
    }

}
