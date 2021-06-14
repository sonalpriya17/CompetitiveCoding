package Array.TwoPointeralgo;

public class RemoveAllZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1,3,4,0,5,0,5,3,2,5,7,9,0,6,0};
         int j = arr.length-1;
         for(int i=0;i<=j;i++){
             if(arr[j]==0){
                 j--;
             }
             if(arr[i]==0){
               int temp = arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j--;
             }
         }
         for(int k =0;k<arr.length;k++){
             System.out.print(arr[k]+",");
         }

    }


    }

