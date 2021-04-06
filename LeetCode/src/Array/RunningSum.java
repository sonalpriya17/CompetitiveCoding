package Array;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,7};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum= sum+arr[i];
           arr[i]=sum;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
