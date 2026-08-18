package Prefix_Infix_Postfix_Problems;

import java.util.Stack;

//a+b*(c^d-e)

public class Infix_to_Postfix {

    private static int priority(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return -1;
    }

    private static String sol(String infix){
        Stack<Character> st = new Stack<>();
        String ans = "";

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                ans += ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while(!st.empty() && st.peek() != '('){
                    ans += st.pop();
                }
                st.pop();
            }else{
                while(!st.empty() && st.peek() != '(' && priority(st.peek()) >= priority(ch)){
                    ans += st.pop();
                }
                st.push(ch);
            }
        }

        while(!st.empty()){
            ans+=st.pop();
        }

        return ans;
    }

    public static void main(String[] args){
        String infix = "a+b*(c^d-e)";
        System.out.println("Infix is : " + infix);

        System.out.println("Postfix is : " + sol(infix));
    }

}
