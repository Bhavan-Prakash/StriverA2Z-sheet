public class Selection_sort {
    public static void main(String[] args){
        int[] arr = {10,14,5,20,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            int current_index = i;
            for (int j = current_index+1; j < arr.length; j++) {
                if(arr[current_index] > arr[j]){{
                    current_index = j;
                }}
            }

            int temp = arr[i];
            arr[i] = arr[current_index];
            arr[current_index] = temp;
            }

        for(int x : arr){
            System.out.println(x);
        }
    }
}
