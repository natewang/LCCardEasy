package com.company.nate.SortAndSearch;

/*
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]
*/

import java.util.Arrays;

public class p52 {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m + n  -1;
        int j = m - 1;
        int k = n - 1;

        while (k >= 0 && j >= 0) {

            if (nums1[j] > nums2[k]) {
                nums1[i] = nums1[j];
                j--;
                i--;
            } else {

                nums1[i] = nums2[k];
                k--;
                i--;
            }

        }

        while (k >= 0) {

            nums1[i] = nums2[k];
            k--;
            i--;
        }

    }


    public static void main(String[] args) {

        int[] num1 = {0};
        int[] num2 = {1};

        merge(num1, 0, num2, 1);

        System.out.println(Arrays.toString(num1));
    }

}
