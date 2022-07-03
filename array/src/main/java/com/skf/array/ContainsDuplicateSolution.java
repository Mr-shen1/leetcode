package com.skf.array;

import java.util.Arrays;

/**
 * desc:
 *
 * @author: skf
 * @date: 2022/06/29
 */
public class ContainsDuplicateSolution {
    static int[] nums = {1, 2, 3, 4};

    public static void main(String[] args) {
        boolean solve = solve(nums);
        System.out.println(solve);
    }

    private static boolean solve(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] == nums[i]) {
                return true;
            } else {
                count++;
                continue;
            }
        }
        return false;
    }
}
