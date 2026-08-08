package Stack;

class stack_imp{
    int top = -1;
    int[] stack = new int[10];

    public int top(){
        if(top == -1){
            System.out.println("stack is empty !!");
        }

        System.out.println(stack[top]);
        return stack[top];
    }

    public void push(int n){
        top = top+1;
        stack[top] = n;
        System.out.print("now stack is : ");

        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i] + " ");
        }
    }

    public void pop(){
        top = top-1;
        System.out.println(stack[top+1] + " removed");
    }

    public int size(){
        System.out.println(top+1);
        return top+1;
    }
}

public class Stack_using_array {
    public static void main(String[] args){
        stack_imp st = new stack_imp();

        st.push(10);
        st.push(1);
        st.push(11);
        st.push(12);
        st.pop();
        st.top();
        st.size();
    }
}
