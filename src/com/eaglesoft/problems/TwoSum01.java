package com.eaglesoft.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum01 {
    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        int[] result = solution01.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("" + result[0] + " , " + result[1]);
    }
}

class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if (map.containsKey(y)) {
                ans[0] = i;
                ans[1] = map.get(y);
            } else {
                map.put(x, i);
            }
        }
        return ans;
    }
}
