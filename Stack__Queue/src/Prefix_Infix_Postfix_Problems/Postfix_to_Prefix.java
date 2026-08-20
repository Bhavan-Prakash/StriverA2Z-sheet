package Prefix_Infix_Postfix_Problems;

import java.util.Stack;

public class Postfix_to_Prefix {
    private static String ans(String given){
        Stack<String> st = new Stack<>();

        for (int i = 0; i < given.length(); i++) {
            Character ch = given.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            } else if ((ch == '*' || ch == '/' || ch == '+'|| ch == '-') && st.size()>= 2) {
                String temp = st.pop();
                String temp2 = st.pop();
                String required = String.valueOf(ch) + temp2 + temp;
                st.push(required);
            }
        }
        return st.peek();
    }

    public static void main(String[] args){
        String given = "ab-de+f*/";

        System.out.println("original : " + given);
        System.out.println("After : " + ans(given));
    }
}
