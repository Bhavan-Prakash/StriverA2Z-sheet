public class Recursive_Insertion_Sort {

    public int[] logic(int[] arr, int size, int i){

        if(i == size) return arr;

        int j = i;

        while(j>0 && arr[j-1]> arr[j] ){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        logic(arr, size, i+1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1};

        System.out.println("Array before sorting :");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        Recursive_Insertion_Sort obj = new Recursive_Insertion_Sort();
        int[] arr_result =  obj.logic(arr, arr.length, 0);

        System.out.println("Sorted array : ");
        for (int num : arr_result){
            System.out.print(num + " ");
        }
    }

}
