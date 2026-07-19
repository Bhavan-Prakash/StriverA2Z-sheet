public class Occurance_in_Sorted_Array {

    public int first_occ(int[] arr, int x, int size){

        int low = 0;
        int high = size-1;
        int first_occ = -1;

        while(low<= high){
            int mid = (low+high)/2;

            if(arr[mid] == x){
                first_occ = mid;
                high = mid-1;
            } else if(arr[mid] <= x){
                high = mid-1;
            }else{
                low=mid+1;
            }

        }
    return first_occ;

    }

    public int last_occ(int[] arr, int x, int size){
        int low = 0;
        int high = size-1;
        int last_occ = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == x){
                last_occ = mid;
                low = mid+1;
            } else if(arr[mid] <= x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return last_occ;
    }

    public static void main(String[] args){
        int[] arr = {3,3,3,3,3,4};
        int x =3;
        Occurance_in_Sorted_Array obj = new Occurance_in_Sorted_Array();
        int first = obj.first_occ(arr,x,arr.length);
        int last = obj.last_occ(arr, x, arr.length);

        System.out.println("Occurance of " + x + " is : " + ((last-first)+1) );
    }

}
