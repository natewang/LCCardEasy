package com.company.nate.Array;

import java.util.Arrays;

public class p11 {

    static public void rotate(int[][] matrix) {

        int n = matrix.length;

        //控制圈数
        for (int i = 0; i < n / 2; i++) {

            for (int j = i; j < n - 1 - i ; j++) {

                  int temp = matrix[i][j];
                  matrix[i][j] = matrix[n - 1 - j][i];
                  matrix[n - 1 -j][i] = matrix[n - 1- i][n - 1 - j];
                  matrix[n - 1- i][n - 1- j] = matrix[j][n - 1 - i];
                  matrix[j][n - 1 - i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // write your code her

        int[][] nums1 =
                        {
                        {1,2,3,4},
                        {4,5,6,5},
                        {7,8,9,9},
                                {1,1,1,1}
                        };

        rotate(nums1);
        System.out.println(Arrays.toString(nums1));
    }


}
