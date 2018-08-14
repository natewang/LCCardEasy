package com.company.nate.Array;

public class p5 {

    static public int singleNumber(int[] nums) {

        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {

            res = res ^ nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        // write your code her

        int[] intArray = {4,1,2,1,2};
        System.out.println(singleNumber(intArray));
    }

}
