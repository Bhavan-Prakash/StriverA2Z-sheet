public class Last_Occurance_In_The_Array {

    public int logic(int[] arr, int target, int size){
        int low = 0;
        int high = size-1;
        int index = -1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=target){
                index = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        if(arr[index] == target) return index;
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {3, 4, 13, 13, 13, 20, 40};

        Last_Occurance_In_The_Array obj = new Last_Occurance_In_The_Array();
        System.out.println("Result is : " + obj.logic(arr,13, arr.length));
    }

}
