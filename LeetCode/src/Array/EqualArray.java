package Array;

import java.util.Arrays;

public class EqualArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       // boolean flag = true;
        for (int i=0;i<arr1.length-1;i++){
            boolean flag = true;
            if(arr1[i]!=arr2[i]){
                flag = false;
                System.out.println("not equal arr");
            }
            if(flag==true){
                System.out.println(" equal arr");
            }
        }

        }}



