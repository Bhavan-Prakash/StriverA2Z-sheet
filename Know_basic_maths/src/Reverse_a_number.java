public class Reverse_a_number {
    public static int rev(int num){
        int revno = 0;
        while(num>0){
            int lastdigi = num%10;

            revno = revno*10 + lastdigi;

            num = num/10;
        }

        return revno;
    }

    public static void main(String[] args){
        System.out.println(rev(743));
    }
}
