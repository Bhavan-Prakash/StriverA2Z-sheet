import java.util.Arrays;
import java.util.Scanner;

public class highestLowest_freq_element {
    public int[] input(int size){
        Scanner sc = new Scanner(System.in);
        int[] input_arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the element at " + i +"th " + "index");
            input_arr[i] = sc.nextInt();
        }
        return input_arr;
    }


    public int[] hash(int[] arr){
        //we are using getasint because stream return optionalint type
        int[] hash_arr = new int[Arrays.stream(arr).max().getAsInt() + 1];

        for (int i = 0; i < arr.length; i++) {
            hash_arr[arr[i]]++;
        }

        return hash_arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();
        highestLowest_freq_element cls = new highestLowest_freq_element();
        int[] input_arr = cls.input(size);
        int[] hash = cls.hash(input_arr);

        int highest = 0;
        int highest_element = -1;

        int lowest = 0;
        int lowest_element = -1;

        for (int i = 0; i < hash.length; i++) {
            if(hash[i]>highest){
                highest = hash[i];
                highest_element = i;
            }else if(hash[i] > 0){
                lowest = hash[i];
                lowest_element = i;
            }
        }

        System.out.println("highest element is: " + highest_element + "\n" + "lowest element is : " + lowest_element);



        }

    }
