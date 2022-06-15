package com.eaglesoft.problems;

/**
 * LeetCode : https://leetcode.com/problems/binary-search/
 */
public class BinarySearch704 {
    public static void main(String[] args) {
        Solution704 solution704 = new Solution704();
        System.out.println(solution704.search(new int[]{-1,0,3,5,9,12},2));
    }
}

class Solution704 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        if(nums[high] == target){
            return high;
        }else return -1;
    }
}
