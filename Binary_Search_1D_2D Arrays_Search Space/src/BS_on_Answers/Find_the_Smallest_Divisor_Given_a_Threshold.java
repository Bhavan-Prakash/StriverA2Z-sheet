package BS_on_Answers;

import java.util.Arrays;

public class Find_the_Smallest_Divisor_Given_a_Threshold {

    public int logic(int[] arr, int k){

        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int res = -1;

        while(low<= high){
            int mid = (low+high)/2;
            int sum = 0;

            for(int i : arr){
                sum += (i + mid - 1) / mid; //ceiling division which gives 1 of its 0/2
            }

            if(sum <= k){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {8,4,2,3};
        int k = 10;

        Find_the_Smallest_Divisor_Given_a_Threshold obj = new Find_the_Smallest_Divisor_Given_a_Threshold();

        System.out.println("Result is : " + obj.logic(arr,k));
    }

}
