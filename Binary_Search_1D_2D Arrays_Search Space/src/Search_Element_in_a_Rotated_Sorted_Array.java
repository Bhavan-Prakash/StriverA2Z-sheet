public class Search_Element_in_a_Rotated_Sorted_Array {

    public int logic(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int index = -1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            }

            if(arr[low]<=arr[mid]){
                if(arr[low] <= x && x < arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid]<x && x<arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

        return index;
    }

    public static void main(String[] args){
        int[] arr ={4, 5, 6, 7, 0, 1, 2};

        Search_Element_in_a_Rotated_Sorted_Array obj = new Search_Element_in_a_Rotated_Sorted_Array();

        System.out.println("Result is : " + obj.logic(arr, 0));
    }

}
