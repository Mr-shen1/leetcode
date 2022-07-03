package com.skf.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * desc:
 *
 * @author: skf
 * @date: 2022/06/30
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 5, 55, 15};
        int target = 7;

        int[] ints = twoSum2(nums, target);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
