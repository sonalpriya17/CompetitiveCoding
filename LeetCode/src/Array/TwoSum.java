package Array;

import java.lang.reflect.Array;
import java.util.*;

public class TwoSum{
/*    public static int[] twoSum(int[] nums, int target) {
      int [] result = new int[2];
      for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        System.out.println("result size" + result.length);
        return result;
    }*/
  /*  public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                result[0]=i;
                result[1]=j;
                }
            }
        }
        System.out.println("result size" + result.length);
        return result;
    }*/
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
              return new int[]{map.get(target-nums[i]),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr[] =new int[]{3,2,4};
        System.out.println("output "+Arrays.toString(  twoSum(arr,6)));

    }
}
