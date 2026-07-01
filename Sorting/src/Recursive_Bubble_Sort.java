public class Recursive_Bubble_Sort {

    public int[] logic(int[] arr, int size){
        if(size == 1){
            return arr;
        }

        int temp = 0;

        for(int j =1; j<size; j++){
            if(arr[j]<arr[j-1]){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        logic(arr, size-1);

        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3,2,5,1};
        int size = arr.length;

        System.out.println("Aray before sorting");

        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        Recursive_Bubble_Sort obj = new Recursive_Bubble_Sort();
        int[] result = obj.logic(arr,size);

        System.out.println("Array after sorting : ");
        for(int num : result){
            System.out.print(num + " ");
        }
    }

}
