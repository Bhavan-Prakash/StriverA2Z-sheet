package Prefix_Infix_Postfix_Problems;

import java.util.Stack;

public class Postfix_to_infix {

    private static String removal_add(String top1, String top2, String operator) {
        return "(" + top1 + operator + top2 + ")";
    }

    private static String ans(String given){
        Stack<String> st = new Stack<>();
        for (int i = 0; i < given.length(); i++) {
            Character ch = given.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            } else if ((ch == '+' || ch == '*' || ch == '-' || ch == '/') && st.size() >= 2) {
                String temp = st.pop();
                String temp2 = st.pop();
                String required = removal_add(temp2,temp,String.valueOf(ch));
                st.push(required);
            }
        }
        String result = st.peek();
        // Remove only the outermost parentheses
        return result.substring(1, result.length() - 1);
    }

    public static void main(String[] args){
        String given = "ab*cd/+";

        System.out.println("original : "+ given);
        System.out.println("After : " + ans(given) );
    }

}
