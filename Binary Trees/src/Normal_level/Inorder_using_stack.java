package Normal_level;

import java.util.ArrayList;
import java.util.Stack;

class Tree_in{
    Tree_in right;
    Tree_in left;
    int data;

    Tree_in(int value){
        data = value;
        left = null;
        right = null;
    }
}
public class Inorder_using_stack {
    public static void main(String[] args) {
        Tree_in root = new Tree_in(5);
        root.left = new Tree_in(10);
        root.right = new Tree_in(17);
        root.left.left = new Tree_in(13);
        root.left.right = new Tree_in(14);
        root.left.right.left = new Tree_in(15);
        root.left.right.right = new Tree_in(16);

        Stack<Tree_in> st = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();

        Tree_in current = root;
        while (current != null || !st.empty()) {


            if (current != null) {
                st.push(current);
                current = current.left;
            }else{
                current = st.pop();

                answer.add(current.data);
                current = current.right;
            }
        }

        for (int x : answer){
            System.out.print(x + " ");
        }
    }
}
