package com.eaglesoft.problems;

/**
 * LeetCode : https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber09 {
    public static void main(String[] args) {
        Solution09 solution09 = new Solution09();
        System.out.println(solution09.isPalindrome(121));
    }
}

class Solution09 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverseNumber = reverseNum(x);
        return reverseNumber == x;
        //return usingString(x);
    }

    private int reverseNum(int x) {
        int reverse = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return reverse;
    }

    private boolean usingString(int x) {
        String xString = x + "";
        StringBuffer stringBuffer = new StringBuffer(xString).reverse();
        return xString.contentEquals(stringBuffer);
    }

}
