package Array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.Array;
import java.util.Arrays;

public class LeftRotation {
/*    public static void main(String[] args) {
        int[] arr = {3,4,6,8,2,7,9};
        System.out.println("Original : "+ Arrays.toString(arr));
        int n = arr.length-1;
        int d = 3;

           for (int i = 0; i < d - 1; i++) {
               int temp = arr[0];
               for(int j=0;j<arr.length-1;j++){
                   arr[j]= arr[j+1];
               }
               arr[arr.length-1]= temp;
           }
        System.out.println("rotated : "+ Arrays.toString(arr));
       }*/
public static void main(String[] args) {
    int d = 2;
    int k=0;
    int arr[] = {1,2,3,4,5};
    int result[] = new int[arr.length];
    for(int i=0;i<arr.length-d;i++){
        result[i]=arr[i+d];
    }
    for(int i = arr.length-d;i<=arr.length-1;i++){
        result[i]=arr[k++];
    }


    System.out.println(Arrays.toString(result));
}

    }

