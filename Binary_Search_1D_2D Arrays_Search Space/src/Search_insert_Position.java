public class Search_insert_Position {

    public int logic(int[] arr, int x){
        int size = arr.length;

        int low = 0;
        int high = size-1;
        int result = size-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] <= x){
                result = mid+1;
                 low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7};

        Search_insert_Position obj = new Search_insert_Position();
        int result = obj.logic(arr, 2);
        System.out.println(result);

    }

}
