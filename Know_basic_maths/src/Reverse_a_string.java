public class Reverse_a_string {

    public static String reverse(String input){
        int len = input.length();
        String rev = "";
        for(int i =len-1; i>=0; i--){
                rev += input.charAt(i);
            }
        return rev;

        }

    public static void main(String[] args){
        System.out.println(reverse("bhavan"));
    }

}