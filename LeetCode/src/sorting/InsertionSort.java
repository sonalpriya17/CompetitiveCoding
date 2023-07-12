package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{8, 4, 1, 5, 9, 2};
        for(int i=1;i<a.length;i++){
            int j=i-1;
            int temp = a[i];
            while(j>=0 && temp<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println(Arrays.toString(a));

    }
}
