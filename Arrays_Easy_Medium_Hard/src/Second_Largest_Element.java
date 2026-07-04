import java.util.Scanner;

public class Second_Largest_Element {

    public int[] logic(int[] arr, int low, int size){

        if(low == size) return arr;
        int i = low-1;

        while(i>=0 && arr[i] > arr[i+1]){
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
            i--;
        }

        logic(arr, low+1, size);
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the element at " + (i+1) + "th" + " position");
            int element = sc.nextInt();
            arr[i] = element;
        }

        Second_Largest_Element obj = new Second_Largest_Element();
        int[] soln = obj.logic(arr,0,size);
        System.out.println("Second Larges element is : " + soln[size-2]);

    }
}
