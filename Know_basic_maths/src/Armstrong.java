import java.util.ArrayList;
import java.util.List;

public class Armstrong {
    public boolean logic(int no){
        List<Integer> digits = new ArrayList<Integer>();
        int no_duplicate = no;

        while(no_duplicate>0){
            digits.add(no_duplicate%10);
            no_duplicate = no_duplicate/10;
        }
        double result = 0;
        for(int i = 0; i<digits.size(); i++){
            result += Math.pow(digits.get(i), digits.size());
        }

        System.out.println(result);
        System.out.println(no);

        return result == no;
    }

    public static void  main(String[] args){
        Armstrong arm = new Armstrong();
        System.out.println(arm.logic(371));

    }
}
