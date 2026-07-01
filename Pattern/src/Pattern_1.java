import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pattern_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no : ");

        int no = sc.nextInt();
        int j = 0;

        for(int i = 0; i<no; i++){

            while(j<no){
                System.out.print("*");
                j++;
            }
            j = 0;
            System.out.println();


        }
    }
}