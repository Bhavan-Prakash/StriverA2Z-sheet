public class Search_X_in_Sorted_Array {

    public int logic(int[] arr,int target){
        int size = arr.length;
        int low = 0;
        int high = size-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == target) return mid;
            else if (arr[mid] > target) {
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {3,4,6,7,9,12,16,17};
        int target = 6;

        Search_X_in_Sorted_Array obj = new Search_X_in_Sorted_Array();
        int result = obj.logic(arr,target);
        if(result == -1) System.out.println(target + " Not Found");
        else System.out.println(target + " Found at " + result);

    }

}
