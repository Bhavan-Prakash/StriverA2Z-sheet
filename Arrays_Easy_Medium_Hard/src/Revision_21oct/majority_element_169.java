package Revision;

public class majority_element_169 {
}

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans_index = nums.length/2;
        int ans = nums[ans_index];
        return ans;
    }
}
