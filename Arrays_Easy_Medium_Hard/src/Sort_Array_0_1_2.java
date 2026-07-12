public class Sort_Array_0_1_2 {

    public int[] logic(int[] arr){
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {0,0,1,1,1};

        Sort_Array_0_1_2 obj = new Sort_Array_0_1_2();
        int[] result = obj.logic(arr);

        System.out.println("Sorted array is :");
        for (int num : result){
            System.out.print(num + " ");
        }
    }

}
