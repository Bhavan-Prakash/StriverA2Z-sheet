import java.util.Scanner;

public class Check_If_Sorted_II {

    public boolean logic(int[]arr, int size, int low){
        if(low == size) return true;

        int i = low-1;
        if(i>=0 && arr[i] > arr[i+1]){
            return false;
        }

        return logic(arr, size, low+1);


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

        Check_If_Sorted_II obj = new Check_If_Sorted_II();

        System.out.println(obj.logic(arr,size,0));

    }
}
