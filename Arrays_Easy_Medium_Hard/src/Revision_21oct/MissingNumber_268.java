//package Revision_21oct;
//
//public class MissingNumber {
//}
//
//class Solution {
//    public int missingNumber(int[] nums) {
//        int[] arr = new int[nums.length+1];
//        Arrays.fill(arr, -1);
//
//
//        for(int i = 0; i<nums.length; i++){
//            int curr = nums[i];
//            arr[curr] = curr;
//        }
//
//        for(int j = 0; j<arr.length; j++){
//            if(arr[j] == -1){
//                return j;
//            }
//        }
//        return 0;
//    }
//}