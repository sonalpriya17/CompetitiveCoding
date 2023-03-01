package map;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] charArr = s.toCharArray();
        int sum=0;
        for (int i = charArr.length - 1; i >=0; i--) {
            //IX if present > present-1 sum+= present-[present-1]
            //VII if present <= present-1 sum+= present-[present-1]
            //if present>0
            if(i>0 && map.get(charArr[i])>map.get(charArr[i-1])){
                sum+=map.get(charArr[i])-map.get(charArr[i-1]);
                i--;
            }
            else{
                sum+=map.get(charArr[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(" op --->"+ romanToInt("XLIX") );
    }

}
