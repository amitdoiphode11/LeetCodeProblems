package com.eaglesoft.problems;

import java.util.Arrays;

/**
 * LeetCode Link: https://leetcode.com/problems/single-number/
 */
public class SingleNumber136 {
    public static void main(String[] args) {
        Solution136 solution136 = new Solution136();
        int[] numbs = new int[]{2, 2, 1, 4, 4};
        System.out.println(solution136.singleNumber(numbs));
    }
}

class Solution136 {
    /**
     * Using XOR operator find out the different element in given array.
     * This function used when only one single element is different.
     * Uses the reduce() java8 Stream function.
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }
}