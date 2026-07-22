public class Peak_element_in_Array {

    public int logic(int[] arr){

        if(arr.length == 1){
            return arr[0];
        }

        int low = 0;
        int high = arr.length-1;


        while(low<=high){

            int mid = (low+high)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else{
                if(arr[mid] > arr[mid-1]){
                    low = mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int[] arr = {1,2,1,3,5,6,4};

        Peak_element_in_Array obj = new Peak_element_in_Array();
        System.out.println("Result is : "+ obj.logic(arr));
    }

}
