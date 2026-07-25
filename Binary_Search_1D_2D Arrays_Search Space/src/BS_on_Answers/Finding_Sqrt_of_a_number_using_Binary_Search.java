package BS_on_Answers;

public class Finding_Sqrt_of_a_number_using_Binary_Search {

    public int logic(int n) {
        int low = 1;
        int high = n;
        int res = 1;

        while(low<=high){
            int mid = (low+high)/2;

            if(mid*mid <= n ){
                res = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return res;
    }

    public static void main(String[] args){
        Finding_Sqrt_of_a_number_using_Binary_Search obj = new Finding_Sqrt_of_a_number_using_Binary_Search();

        System.out.println("Answer is : " + obj.logic(28));
    }
}
