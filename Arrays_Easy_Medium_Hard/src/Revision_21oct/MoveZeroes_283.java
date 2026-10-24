package Revision;

public class MoveZeroes_283 {
}

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length - 1;
        int cnt = 0;

        for(int i = 0; i<=n;i++){
            if(nums[i] == 0){
                cnt ++;
            }else if(cnt != 0){
                nums[i-cnt] = nums[i];
                nums[i] = 0;

            }

        }

    }
}