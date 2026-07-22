public class Search_Single_Element_in_a_sorted_array {

    public int logic(int[] arr){

        if(arr.length == 1){
            return arr[0];
        }

        int low = 0;
        int high = arr.length-1;
        int res = 0;

        if(arr[low] == arr[low+1]){
            low = low+1;
        }else{
            return arr[low];
        }
        if(arr[high] == arr[high-1]){
            high = high-1;
        }else{
            return arr[high];
        }

        while(low<=high){

            int mid = (low + high)/2;

            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            if(arr[mid] == arr[mid-1]){
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,4,4,5,5,6,6};

        Search_Single_Element_in_a_sorted_array obj = new Search_Single_Element_in_a_sorted_array();

        System.out.println("Result is : "+ obj.logic(arr));
    }

}
