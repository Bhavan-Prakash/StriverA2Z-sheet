public class Find_out_how_many_times_the_array_has_been_rotated {

    public int logic(int[] arr){
        int low = 0, high = arr.length-1;
        int min = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid]>arr[low]){
                min = low;
                low = mid+1;
            }else{
                 high = mid - 1;
            }

        }
        return min;
    }

    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,0,1,2,3};

        Find_out_how_many_times_the_array_has_been_rotated obj = new Find_out_how_many_times_the_array_has_been_rotated();

        System.out.println("Result is : " + obj.logic(arr));
    }

}
