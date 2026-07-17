public class Floor_and_Ceil {

    public int ceil(int[] arr, int x){

        int low = 0;
        int high = arr.length-1;
        int ceil = 0;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]<x){
                low = mid+1;
            }else{
                ceil = arr[mid];
                high = mid-1;
            }

        }
        return ceil;
    }

    public int floor(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int floor = 0;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]<= x){
                floor = arr[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }

        }


        return floor;
    }

    public static void main(String[] args){
        int[] arr = {3, 4, 4, 7, 8, 10};

        Floor_and_Ceil obj = new Floor_and_Ceil();
        int ceil = obj.ceil(arr,5);
        int floor = obj.floor(arr,5);
        System.out.println("ceil is : " + ceil);
        System.out.println("floor is : " + floor);

    }
}
