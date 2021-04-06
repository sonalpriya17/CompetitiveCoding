import java.util.*;

public class GeeksForGeeks {
   /*   1- Write code to filter duplicate elements from an array and print as a list?
            2- Write code to sort the list of strings using Java collection?
            3- Write a function to reverse a number in Java?
            4- Write a method to check prime no. in Java?
            5- Write a Java program to find out the first two max values from an array?
            6- Write a Java program to find the longest substring from a given string which doesn’t contain any duplicate characters?
            7- Write Java code to get rid of multiple spaces from a string?
            8- Write Java code to identify a number as Palindrome?
            9- Write Java code to swap two numbers without using a temporary variable?
            10- Write a Java program to demonstrate string reverse with and without StringBuffer class?*/

    public static void main(String[] args) {
        filterDuplicateElement();
    }

    private static void filterDuplicateElement() {
        int arr [] = {1,4,3,6,7,4,3,2,6,87,9,6,8,5,7,3};
        Set<Integer> set = new HashSet<>();
        for(int i= 0; i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        System.out.println(set);
    }
}
