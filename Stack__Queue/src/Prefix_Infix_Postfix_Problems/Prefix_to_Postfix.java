package Prefix_Infix_Postfix_Problems;

import java.util.Stack;

public class Prefix_to_Postfix {
    private static String ans(String given){
        Stack<String> st = new Stack<>();

        for (int i = given.length()-1; i >=0 ; i--) {
            Character ch = given.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            } else if ((ch == '*' || ch == '/' || ch == '+'|| ch == '-') && st.size()>= 2) {
                String temp = st.pop();
                String temp2 = st.pop();
                String required = temp + temp2 + String.valueOf(ch);
                st.push(required);
            }
        }
        return st.peek();
    }

    public static void main(String[] args){
        String given = "/-ab*+def";

        System.out.println("original : " + given);
        System.out.println("After : " + ans(given));
    }
}
