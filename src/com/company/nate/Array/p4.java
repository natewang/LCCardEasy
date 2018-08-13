package com.company.nate.Array;

import java.util.Arrays;
import java.util.HashSet;

public class p4 {

    static public boolean containsDuplicate(int[] nums) {

        HashSet set = new HashSet();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        // write your code her

        int[] intArray = {1,2,3,4,5,6,1};
        System.out.println(containsDuplicate(intArray));
    }

}
