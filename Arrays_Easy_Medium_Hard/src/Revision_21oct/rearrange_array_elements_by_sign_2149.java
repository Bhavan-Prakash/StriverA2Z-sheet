package Revision;

public class rearrange_array_elements_by_sign_2149 {
}

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr_neg = new int[nums.length/2];
        int[] ans = new int[nums.length];

        int j = 0;
        int z = 0;
        int k = 0;

        // First, store all negative numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr_neg[k++] = nums[i];
            }
        }


        for(int i = 0; i<nums.length; i++){
            if(nums[i] >= 0){
                ans[j] = nums[i];
                ans[j + 1] = arr_neg[z];
                j += 2;
                z++;
            }
        }
        return ans;
    }
}