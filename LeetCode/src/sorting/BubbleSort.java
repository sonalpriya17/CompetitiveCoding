package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] n = new int[]{4,3,7,1,5,9,10,11};
        for(int i=0;i<n.length-1;i++){
            System.out.println("value of i: "+i);
            boolean isSwap = false;
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                    //swap
                   isSwap=true;
                    int temp = n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
            if(!isSwap){
                break;
            }
        }
        System.out.println("sorted arr: "+ Arrays.toString(n));


    }

}
