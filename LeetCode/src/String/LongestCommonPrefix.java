package String;

import java.util.*;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        //if array is empty return blank string
        if(strs.length==0){
            return "";
        }
        //if array as only one element return 1st element
        if(strs.length==1){
            return strs[0];
        }

        /* sort the array of strings */
        Arrays.sort(strs);
        System.out.println("sorted arr :"+Arrays.toString(strs));

        /* find the minimum length from first and last string */
        int end = Math.min(strs[0].length(),strs[strs.length-1].length());

         /* find the common prefix between the first and
           last string */
        int i=0;
        while (i<end && strs[0].charAt(i)==strs[strs.length-1].charAt(i) )
            i++;
            String prefix = strs[0].substring(0,i);
            return prefix;
    }

    public static void main(String[] args) {
        //System.out.println("longestCommonPrefix "+ longestCommonPrefix(new String[]{"flower","flow","flight"}));

        System.out.println("longestCommonPrefix "+ longestCommonPrefix(new String[]{"aaa","aa","aaa"}));
    }
}
