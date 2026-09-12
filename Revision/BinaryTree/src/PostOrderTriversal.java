import java.util.Stack;

public class PostOrderTriversal {
    public static void postorder(node n){
        if(n == null) return;

        Stack<node> st = new Stack<>();

        System.out.println(n.data);

        st.add(n);
        while(!st.empty()){
            if(st.peek().left != null){
                st.add(st.peek().left);
            }else{
                System.out.println(st.pop());
            }


        }
    }
}
