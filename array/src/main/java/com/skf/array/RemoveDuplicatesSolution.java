package com.skf.array;

/**
 * desc:
 *
 * @author: skf
 * @date: 2022/06/29
 */
public class RemoveDuplicatesSolution {
    static int[] nums = {1, 2, 2, 3, 3, 5, 5, 6};

    public static void main(String[] args) {
        int count = solve(nums);
    }

    private static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[left] != nums[i]) {
                nums[++left] = nums[i];
            }
        }
        return ++left;
    }
}
