package com.company.nate.Design;

import java.util.Random;

public class p58 {

    private int[] origin;

    public p58(int[] nums) {

        origin = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {


        return origin;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {

        Random random = new Random();
        int[] nums = (int[])origin.clone();
        for(int i=0;i<origin.length;i++){
            int seq = random.nextInt(nums.length);
            int tmp = nums[i];
            nums[i] = nums[seq];
            nums[seq] = tmp;
        }
        return nums;
    }

    public void main(String[] args) {

        int[] arr = {1,2,3};
        p58 obj = new p58(arr);
        int[] param_1 = obj.reset();
        int[] param_2 = obj.shuffle();
    }



}
