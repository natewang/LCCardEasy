
//https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/28/
package com.company.nate.Array;


import java.util.Arrays;

public class p8 {

    static public void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[j] != 0) {

                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code her

        int[] nums1 = {0,1,0,3,12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
    }

}
