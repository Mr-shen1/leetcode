package com.skf.array;

import java.util.Arrays;

/**
 * desc:
 *
 * @author: skf
 * @date: 2022/06/30
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9, 9};
        int[] ints = plusOne(digits);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                ++digits[i];
                for (int j = i + 1; j < digits.length; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }
}
