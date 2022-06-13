package com.eaglesoft.problems;

/**
 * LeetCode : https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger07 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.reverse(1534236469));
    }
}

class Solution1 {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -1 * x;
        }

        long reverse = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        if(reverse > Integer.MAX_VALUE){
            return 0;
        }
        if (isNegative) {
            reverse = -1 * reverse;
        }
        return (int) reverse;
    }
}

