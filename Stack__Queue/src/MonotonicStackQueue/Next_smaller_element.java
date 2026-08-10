package MonotonicStackQueue;

import java.util.Arrays;
import java.util.Stack;

public class Next_smaller_element {

    private static int[] sol(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length-1; i >= 0 ; i--) {
            while(!st.empty() && st.peek() >= arr[i]){
                st.pop();
            }

            if(st.empty()){
                ans[i] = -1;

            }else{
                ans[i] = st.peek();

            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {4, 8, 5, 2, 25};

        System.out.println("sol is : " + Arrays.toString(sol(arr)));
    }

}
