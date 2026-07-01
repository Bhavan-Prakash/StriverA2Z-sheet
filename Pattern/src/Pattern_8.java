import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int no = sc.nextInt();

        for(int i = 0; i < no; i++){
            for (int j = no; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * no - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
