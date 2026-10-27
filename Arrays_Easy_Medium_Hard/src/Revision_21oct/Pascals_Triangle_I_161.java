package Revision_21oct;

public class Pascals_Triangle_I_161 {
    public static long fac(long no, long check){
        long z = 0;
        long result = 1;

        for (int i = 0; i < check; i++) {
            result *= no;
            no--;
        }
        return result;
    }

    public static void main(String[] args){
        int r = 4;
        int c = 2;

        long numerator = fac(r-1, c-1);
        long denomerator = fac(c-1,c-1);

        long result = numerator/denomerator;
        System.out.println("Element at row " + r + ", column " + c + " = " + result);
    }
}
