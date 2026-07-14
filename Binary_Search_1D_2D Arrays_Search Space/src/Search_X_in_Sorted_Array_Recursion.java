public class Search_X_in_Sorted_Array_Recursion {

    public int logic(int[] arr, int low, int high, int target){
        if(low>high) return -1;

        int mid = (low+high)/2;

        if(arr[mid] == target) return mid;
        else if (arr[mid]>target) {
            return logic(arr,low,mid-1,target);
        }else{
            return logic(arr,mid+1,high,target);
        }
    }

    public static void main(String[] args){
        int[] arr = {3,4,6,7,9,12,16,17};
        int target = 6;

        Search_X_in_Sorted_Array_Recursion obj = new Search_X_in_Sorted_Array_Recursion();
        int result = obj.logic(arr,0,arr.length-1,target);
        if(result == -1) System.out.println(target + " Not Found");
        else System.out.println(target + " Found at " + result);

    }
}
