package Array;

public class twoDArray {
    public static void main(String[] args) {
        int[][] arr = {{8,3,9,0,10}, {3,5,17,1,1},{2,8,6,23,1},{15,7,3,2,9},{6,14,2,6,0}};
        int i,j;
        int sum = 0;
        System.out.print("sum of row: ");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                sum = sum +arr[i][j];
            }
            System.out.print(sum+" ");
            sum = 0;
        }
        System.out.print("\nsum of column: ");
        for(j=0;j<5;j++){
            for(i=0;i<5;i++){
                sum = sum+arr[i][j];
            }
            System.out.print(sum+" ");
        }
            sum = 0;
    }
}
