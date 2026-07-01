public class Print_1_to_n {
    public void logic(int current, int no){
        if(current > no){
            return;
        }
        System.out.println(current + " ");

        logic(current+1,no);
    }

    public static void main(String[] args){
        int c = 10;
        Print_1_to_n p = new Print_1_to_n();
        p.logic(1,c);

    }
}
