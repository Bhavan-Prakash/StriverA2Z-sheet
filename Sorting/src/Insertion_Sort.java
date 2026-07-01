public class Insertion_Sort {
    public int[] logic(int[] arr){
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Sorted array : ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3,2,5,1};

        System.out.println("Array before sorting :");
        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();

        Insertion_Sort obj = new Insertion_Sort();
        obj.logic(arr);
    }
}
