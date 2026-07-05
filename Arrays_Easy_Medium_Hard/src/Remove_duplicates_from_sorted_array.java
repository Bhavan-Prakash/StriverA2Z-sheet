public class Remove_duplicates_from_sorted_array {

    public int[] logic(int[] arr){
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int j = i-1;
            if(j>=0 && arr[j] == 0){
                arr[j] = arr[j+1];
                arr[j+1] = 0;
            }
            while(j>=0 && arr[j] == arr[j-1] && j-1>0){
                arr[j+1] = 0;
                j--;
            }
        }
    }
}
