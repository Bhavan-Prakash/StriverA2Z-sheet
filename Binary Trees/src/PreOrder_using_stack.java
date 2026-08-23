import java.util.ArrayList;
import java.util.Stack;

class Tree_pre{
    Tree_pre right;
    Tree_pre left;
    int data;

    Tree_pre(int value){
        data = value;
        left = null;
        right = null;
    }
}

public class PreOrder_using_stack {

    public static void main(String[] args){

        Tree_pre root = new Tree_pre(5);
        root.left = new Tree_pre(10);
        root.right = new Tree_pre(17);
        root.left.left = new Tree_pre(13);
        root.left.right = new Tree_pre(14);
        root.left.right.left = new Tree_pre(15);
        root.left.right.right = new Tree_pre(16);

        ArrayList<Integer> answer = new ArrayList<>();
        Stack<Tree_pre> st = new Stack<>();

        st.push(root);

        while (!st.empty()){
            Tree_pre current = st.pop();

            answer.add(current.data);

            if(current.right != null){
                st.push(current.right);
            }

            if (current.left != null){
                st.push(current.left);
            }

        }

        for (int x : answer){
            System.out.print(x + " ");
        }

    }

}
