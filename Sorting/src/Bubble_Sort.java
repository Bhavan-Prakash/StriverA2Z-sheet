public class Bubble_Sort {

    public void sort(int[] arr){
        int size = arr.length;

        for (int i = size-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is : ");
        for(int item : arr){
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {10,40,3,20,4,50,3};
        System.out.println("Array before sorting is : ");

        for(int item : arr){
            System.out.print(item + " ");
        }
        System.out.println("\n");
        Bubble_Sort bs = new Bubble_Sort();
        bs.sort(arr);
    }

}
