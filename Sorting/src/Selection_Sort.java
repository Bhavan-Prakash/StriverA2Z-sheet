public class Selection_Sort {
    public void sort_algo(int[] arr){
        int size = arr.length;

        int min_value_index = 0;
        for (int i = 0; i < size; i++) {
            min_value_index = i;
            for (int j = i+1; j < size; j++) {
                if (arr[j] < arr[min_value_index]) {
                    min_value_index = j;
                }
            }
            int temp = arr[min_value_index];
            arr[min_value_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array after sorting is : ");
        for(int item : arr){
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {10,20,5,100,7,2,66};

        System.out.println("Array before sorting is : ");
        for(int item : arr){
            System.out.print(item + " ");
        }
        System.out.println("\n");

        Selection_Sort sl = new Selection_Sort();
        sl.sort_algo(arr);
    }
}
