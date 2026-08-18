package Prefix_Infix_Postfix_Problems;

import java.util.Stack;

public class Infix_to_Prefix {

    private static String rev(String infix) {
        String rev_str = "";

        for (int i = infix.length() - 1; i >= 0; i--) {
            if (infix.charAt(i) == ')') {
                rev_str += '(';
            } else if (infix.charAt(i) == '(') {
                rev_str += ')';
            } else {
                rev_str += infix.charAt(i);
            }
        }

        return rev_str;
    }

    private static int priority(char ch) {
        if (ch == '^') return 3;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else return -1;
    }

    private static String sol(String infix){
        String given = rev(infix);
        String ans = "";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < given.length(); i++) {
            char ch = given.charAt(i);

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

                    while(!st.empty() && priority(ch) < priority(st.peek())){
                        ans += st.pop();
                    }

                st.push(ch);
            }
        }
        while (!st.empty()){
            ans += st.pop();
        }

        return rev(ans);
    }

    public static void main(String[] args){
        String infix = "x+y*z/w+u";

        System.out.println("Infix : " + infix);

        System.out.println("Prefix : " + sol(infix));
    }

}
