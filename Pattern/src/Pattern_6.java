import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int no = sc.nextInt();

        for(int i = no; i>=0 ; i--){
            for(int j = 0; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
