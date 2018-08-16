package com.company.nate.Array;

import java.util.Arrays;

public class p9 {


    static public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] + nums[i] == target) {

                    int[] res = {i, j};
                    return res;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        // write your code her

        int[] nums1 = {2,7,11,5};

        System.out.println(Arrays.toString(twoSum(nums1, 9)));
    }

}
