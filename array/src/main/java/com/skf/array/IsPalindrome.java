package com.skf.array;

/**
 * desc:
 *
 * @author: skf
 * @date: 2022/07/03
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome2(0));

    }

    // mine
    public static boolean isPalindrome1(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // 官解
    public static boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0) && x != 0) {
            return false;
        }
        int reserveNum = 0;
        while (x > reserveNum) {
            reserveNum = reserveNum * 10 + x % 10;
            x /= 10;
        }
        return reserveNum == x || reserveNum / 10 == x;
    }
}
