import java.util.Scanner;

public class Largest_Element {

    public int[] logic_largest(int[] arr, int low, int size){

        if(low == size) return arr;

        int i = low-1;
        while(i>=0 && arr[i] > arr[i+1]){
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
            i--;
        }

        logic_largest(arr,low+1,size);


        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the element at " + i + "th" + " position");
            int element = sc.nextInt();
            arr[i] = element;
        }
        Largest_Element cls = new Largest_Element();
        int[] obj = cls.logic_largest(arr, 0,size);
        System.out.print("largest element is : ");
        System.out.println(obj[size-1]);

//        for(int num : obj){
//            System.out.print(num);
//        }
    }

}

