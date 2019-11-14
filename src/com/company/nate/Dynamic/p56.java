package com.company.nate.Dynamic;

/*
* 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
*/


public class p56 {

    public static int maxSubArray(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }

        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {

            int cur = nums[i];
            int curResult = cur;

            if (cur > result) {
                result = cur;
            }

            for (int j = i+1; j < nums.length; j++) {

                curResult += nums[j];

                if (curResult > result) {
                    result = curResult;
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {-2,-1};
        int count = maxSubArray(arr);
        System.out.println(count);
    }
}
