package MonotonicStackQueue;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_Using_Stack_2 {
    private static int[] sol(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        int n = arr.length;
        for (int i = 2*n - 1 ; i >= 0 ; i--) {
            int ind = i%n;
            int currele = arr[ind];
            while(!st.empty() && st.peek()<= currele){
                st.pop();
            }

            if(i<n){
                if(st.empty()){
                    ans[ind] = -1;
                }else{
                    ans[i] = st.peek();
                }
            }

            st.push(currele);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9};

        int[] ans = sol(arr);
        System.out.println("sol is : " + Arrays.toString(ans));
    }
}
