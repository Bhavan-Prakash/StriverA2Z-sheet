import java.util.ArrayList;
import java.util.Stack;

public class Post_order_using_single_stack {

    public static void main(String[] args){
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right = new Tree(3);
        root.right.left = new Tree(6);
        root.right.left.right = new Tree(7);
        root.right.left.right.left = new Tree(8);

        Stack<Tree> st = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();

        Tree current = root;

        while(current != null || !st.empty()){

            if(st.empty() || st.peek() != current){
                st.push(current);
            }


            if(current.left != null){
                current = current.left;
            }else if (current.right != null){
                current = current.right;
            }else{
                answer.add(current.data);
                st.pop();
                if (!st.empty()) {
                    current = st.peek();
                } else {
                    current = null;
                }
            }
        }

        for (int x : answer){
            System.out.print(x + " ");
        }
    }

}
