public class Lower_Bound {

    public int logic(int[] arr, int size, int x){

        int low = 0;
        int high = size-1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] >= x) return mid;
            else if (arr[mid]<x) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,2,3};

        Lower_Bound obj = new Lower_Bound();
        int result = obj.logic(arr,arr.length,2);

        System.out.println(result);

    }

}
