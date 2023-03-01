package rough;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])){
                    System.out.println("map.get(target-nums[i]) --> "+ map.get(target-nums[i]));
                  return new int[] {map.get(target-nums[i]),i};
                }
                map.put(nums[i],i);
            }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        //int target =9;
        //twoSum(nums,target);
        System.out.println("op -->"+ Arrays.toString(twoSum(nums,17)));
    }
}
