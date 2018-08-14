package com.company.nate.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p7 {

    static public int[] plusOne(int[] digits) {

        List<Integer> arr = new ArrayList();
        boolean plusOne = true;
        for (int i = digits.length - 1; i >= 0; i--) {

            int indexValue = digits[i];

            if (plusOne) {

                indexValue += 1;
                if (indexValue > 9) {

                    indexValue = 0;

                } else {
                    plusOne = false;
                }
            }

            arr.add(indexValue);
        }

        if (plusOne) {
            arr.add(1);
        }

        int[] intArr = new int[arr.size()];
        for (int i = arr.size() - 1, j = 0; i >= 0; i--, j++) {

            intArr[j] = arr.get(i);
        }

        return intArr;
    }

    public static void main(String[] args) {
        // write your code her

        int[] nums1 = {9};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(plusOne(nums1)));
    }

}
