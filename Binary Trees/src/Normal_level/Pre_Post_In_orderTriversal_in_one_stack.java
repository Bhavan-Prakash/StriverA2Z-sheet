package Normal_level;

import java.util.ArrayList;
import java.util.Stack;

class Node{
    Node right;
    Node left;
    int data;

    Node(int value){
        data = value;
        left = null;
        right = null;
    }
}

class pair{
    Node node;
    int state;

    pair(Node node, int state){
        this.state = state;
        this.node = node;
    }
}

public class Pre_Post_In_orderTriversal_in_one_stack {
    public static void main(String[] args){
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);


        ArrayList<Integer> preorder = new ArrayList<>();
        ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> postorder = new ArrayList<>();

        Stack<pair> st = new Stack<>();

        st.push(new pair(root,1));

        while(!st.empty()){
            pair current = st.pop();

            int state = current.state;
            Node node = current.node;

            if(state == 1){
                preorder.add(node.data);
                current.state++;

                st.push(current);

                if(node.left!= null){
                    st.push(new pair(node.left,1));
                }
            } else if (state == 2) {
                inorder.add(node.data);
                current.state++;

                st.push(current);

                if(node.right!=null){
                    st.push(new pair(node.right,1));
                }
            }else{
                postorder.add(node.data);
            }
        }

        System.out.println("Preorder: " + preorder);
        System.out.println("Inorder: " + inorder);
        System.out.println("Postorder: " + postorder);

    }
}
