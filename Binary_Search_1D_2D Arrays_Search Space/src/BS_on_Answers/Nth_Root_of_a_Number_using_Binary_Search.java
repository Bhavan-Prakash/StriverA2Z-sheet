package BS_on_Answers;

public class Nth_Root_of_a_Number_using_Binary_Search {

    public int logic(int n, int m){

        int low = 1;
        int high = m;
        int res = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(Math.pow(mid, n) == m){
                return mid;
            } else if (Math.pow(mid, n) < m) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return res;
    }

    public static void main(String[] args){
        Nth_Root_of_a_Number_using_Binary_Search obj = new Nth_Root_of_a_Number_using_Binary_Search();

        System.out.println("Result : " + obj.logic(4,69));
    }

}
