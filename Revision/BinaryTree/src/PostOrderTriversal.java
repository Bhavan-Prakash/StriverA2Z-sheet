import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTriversal {

    public static void ans(node root, Stack<node> st1, Stack<node> st2, ArrayList<Integer> sol){

        st1.push(root);

        while(!st1.empty()){
            node temp = st1.pop();
            st2.push(temp);
            if(temp.left != null){
                st1.push(temp.left);
            }

            if(temp.right != null){
                st1.push(temp.right);
            }
        }

        while (!st2.empty()){
            node temp = st2.pop();
            sol.add(temp.data);
        }

    }

    public static void main(String[] args){
        node root = new node(1);
        root.right = new node(5);
        root.left = new node(2);
        root.left.left = new node(4);
        root.left.right = new node(3);

        Stack<node> st1 = new Stack<>();
        Stack<node> st2 = new Stack<>();
        ArrayList<Integer> sol = new ArrayList<>();
        ans(root, st1, st2, sol);

        for(int x : sol){
            System.out.print( x + ", ");
        }
    }
}
