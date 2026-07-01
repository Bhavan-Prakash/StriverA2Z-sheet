import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int no = sc.nextInt();

        for(int i = 0; i<no; i++){
            for(int j = 0; j<no-i-1; j++){
                System.out.print(" ");
            }
            for(int z = 0; z<2*i+1;z++){
                System.out.print("*");
            }
            for (int k = 0; k < no-i-1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
