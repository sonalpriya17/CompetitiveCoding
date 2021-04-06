package Array;

public class TargetSumOfArray {
    public static void main(String[] args) {
        int [] arr = {3,5,7,2,5,7,9};
        int target_sum = 8;
        int sum =0;
        for(int i=0;i<arr.length-1;i++){
            sum += arr[i];
            if(sum>=target_sum){
               int diff = sum-target_sum;
                System.out.println("Diff: "+ diff);
               break;
            }
        }
    }
}
