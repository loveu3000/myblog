package com.tangsir;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {
        int[] nums = {2,2,5,8};
         int target = 10;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
    /*两数之和*/
    public static int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(target-nums[i],i);
            }else{
                ans[0]=i;
                ans[1]=map.get(nums[i]);
            }
        }
        return ans;
    }
}
