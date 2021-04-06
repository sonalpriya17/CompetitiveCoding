package Array;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CommonNumberIndexArrayHashSet {

    // Print the common numbers in two arrays and also print the index from each array
    public static void main(String[] args) {
        // commonNumber();
        //commonNumberDuplicate();
        //    sumOfMissingElements();
        //  sumOfMissingElementsXor();
        duplicateWordInAString();
    }

    public static void commonNumber() {
        int[] numArray1 = {1, 2, 3, 4, 5, 6, 3, 8};
        int[] numArray2 = {9, 10, 11, 1, 14, 1, 3};
        // Outer loop
        HashSet<Integer> hs = new HashSet<>();
        for (int digit : numArray1) {
            hs.add(digit);
        }
        for (int digit : numArray2) {
            boolean isAdded = hs.add(digit);
            if (isAdded == false) {
                System.out.println(digit);
            }
        }
    }

    public static void commonNumberDuplicate() {
        int[] numArray1 = {1, 2, 3, 4, 5, 6, 3, 8};
        int[] numArray2 = {9, 10, 11, 1, 14, 1, 3};
        // Outer loop
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int digit : numArray1) {
            hs1.add(digit);
        }
        for (int digit : numArray2) {
            hs2.add(digit);
        }
        for (int no : hs2) {
            boolean b = hs1.add(no);
            if (b == false) {
                System.out.println(no);
            }
        }
    }

    /*  a= 1 2 3 4 6
total Number of elements = 5
expected no. of element = 6
find the missing npo '5'*/
    public static void sumOfMissingElements() {

        int a[] = {1, 2, 3, 4, 6};
        int expected_no_of_elements = a.length + 1;
        System.out.println("expected no of element " + expected_no_of_elements);
        int total_sum = (expected_no_of_elements * (expected_no_of_elements + 1)) / 2;
        System.out.println("total sum" + total_sum);
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum " + sum);
        int missing_element = total_sum - sum;
        System.out.println("Missing No is " + missing_element);
    }

    public static void sumOfMissingElementsXor() {
        int a[] = {1, 2, 3, 4, 6};
        int xor1 = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            xor1 = xor1 ^ a[i];
        }
        int xor2 = 1;
        for (int i = 2; i <= a.length + 1; i++) {
            xor2 = xor2 ^ i;
        }
        int xor3 = xor1 ^ xor2;
        System.out.println(xor3);

    }

    public static void duplicateWordInAString() {
        String input = "I am am learning java java";
        HashMap<String,Integer> hm = new HashMap<>();
       String[] s= input.split(" ");
       for(String word: s){
           if(hm.get(word)!= null){
               hm.put(word,(hm.get(word))+1);
           }
           else {
               hm.put(word,1);
           }
       }
        System.out.println(hm);
Iterator<String> iterator = hm.keySet().iterator();
int maxCount =0;
while (iterator.hasNext()){
    String p = iterator.next();
    if(hm.get(p)>maxCount){
        System.out.println("Repeated Word: " +p+ " times "+ hm.get(p));
    }
}

    }
}


