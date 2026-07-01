import java.util.Scanner;

public class understanding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter value at " + i + "th" + "index");
            arr[i] = sc.nextInt();
        }

        //hash logic
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        //printing logic
        System.out.println("enter the no of quieries : ");
        int q = sc.nextInt();
        while(q-- != 0){
            int query = sc.nextInt();
            System.out.println(hash[query]);
        }

    }
}