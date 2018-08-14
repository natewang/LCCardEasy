package com.company.nate.Array;

import java.util.*;

public class p6 {


    static public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> arr = new ArrayList();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {

            Integer value = map.get(nums1[i]);

            map.put(nums1[i], value == null ? 1 : value + 1);
        }

        for (int j = 0; j < nums2.length; j++) {

            if (map.containsKey(nums2[j]) && map.get(nums2[j]) != 0) {

                arr.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j]) - 1);
            }
        }

        int[] result = new int[arr.size()];
        int i = 0;
        for (Integer e : arr)
            result[i++] = e;
        return result;
    }

    public static void main(String[] args) {
        // write your code her

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

}
