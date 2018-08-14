package com.company.nate.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p6 {


    static public int[] intersect(int[] nums1, int[] nums2) {

        List arr = new ArrayList();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    arr.add(nums1[i]);
                    break;
                }
            }
        }

        return toIntArray(arr);
    }

    static int[] toIntArray(List<Integer> integerList) {
        int[] intArray = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            intArray[i] = integerList.get(i);
        }
        return intArray;
    }

    public static void main(String[] args) {
        // write your code her

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1,1};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

}
