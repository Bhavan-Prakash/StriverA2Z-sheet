import java.util.Arrays;
import java.util.Scanner;

public class count_frequency {

    public int[] input(int size){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public int[] hash(int[] arr){
        int max_of_array = Arrays.stream(arr).max().getAsInt();
        int[] hash = new int[max_of_array+1];

//        for (int i = 0; i < arr.length; i++) {
//            hash[arr[i]] += 1; // or hash[arr[i]++]
//        }
        // more enhanced loop
        for(int num : arr){
            hash[num]++;
        }

        return hash;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter thr length of array you want to form :");
        int size = sc.nextInt();

        count_frequency cn = new count_frequency();
        int[] arr = cn.input(size);
        int[] hash = cn.hash(arr);

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println(i + " is repeated: " + hash[i]);
            }
        }
    }

}
