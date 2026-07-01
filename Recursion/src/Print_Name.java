import javax.naming.Name;
import java.util.Scanner;

public class Print_Name {
    public String Name(){
        return "ashish";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("type the value of n :");
        int n = sc.nextInt();
        Print_Name pn = new Print_Name();
        for (int i = 0; i < n; i++) {
            System.out.print(pn.Name() + " ");
        }
    }
}