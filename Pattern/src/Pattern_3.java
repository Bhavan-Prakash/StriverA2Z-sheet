import java.util.Scanner;

public class Pattern_3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int no = sc.nextInt();

        for(int i = 0; i<no; i++){
            for(int j =0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
