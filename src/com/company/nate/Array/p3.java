package com.company.nate.Array;

import java.util.Arrays;

public class p3 {

    static public void rotate(int[] nums, int k) {

        if ( k % nums.length == 0) return;

        k = k % nums.length;

        for (int i = 0; i < k; i++) {

            for (int j = nums.length-1; j > 0  ; j--) {

                int tmp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        // write your code her

        int[] intArray = {1,2,3,4,5,6,7};
        rotate(intArray, 3);
        System.out.println(Arrays.toString(intArray));
    }

}
