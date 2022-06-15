package com.eaglesoft.problems;

/**
 * LeetCode : https://leetcode.com/problems/find-peak-element/submissions/
 */
public class FindPeakElement162 {
    public static void main(String[] args) {
        Solution162 solution162 = new Solution162();
        System.out.println(solution162.findPeakElement(new int[]{1,2,1,3,5,4,6}));

    }
}

class Solution162 {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }
}