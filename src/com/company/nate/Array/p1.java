package com.company.nate.Array;

public class p1 {


    static public int removeDuplicates(int[] nums) {

        if(nums.length < 2) {
            return 1;
        }

        int k = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        // write your code here

        int[] intArray = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(intArray);
        System.out.println(res);
        System.out.println(intArray.toString());
    }

}
