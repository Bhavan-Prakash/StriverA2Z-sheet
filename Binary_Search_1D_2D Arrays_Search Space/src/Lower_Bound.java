public class Lower_Bound {

    public int logic(int[] arr, int size, int x){

        int low = 0;
        int high = size-1;
        int result = size;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,7,8};

        Lower_Bound obj = new Lower_Bound();
        int result = obj.logic(arr,arr.length,8);
        System.out.println(result);

    }

}
