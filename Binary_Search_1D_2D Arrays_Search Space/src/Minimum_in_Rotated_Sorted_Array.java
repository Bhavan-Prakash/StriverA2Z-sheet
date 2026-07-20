public class Minimum_in_Rotated_Sorted_Array {

    public int logic(int[] arr){
        int low = 0 , high = arr.length-1;

         while(low <= high){
             int mid = (low+high)/2;

             if(arr[mid] > high){
                 low = mid+1;
             }else{
                 high = mid;
             }
         }
        return arr[low];
    }

    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2,3};

        Minimum_in_Rotated_Sorted_Array obj = new Minimum_in_Rotated_Sorted_Array();
        System.out.println("result is : " + obj.logic(arr));
    }

}
