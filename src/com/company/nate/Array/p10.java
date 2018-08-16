package com.company.nate.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class p10 {


    static public boolean isValidSudoku(char[][] board) {

        //行
        for (int i = 0; i < board.length ; i++) {

            if (isRepeat(board[i])) {
                return false;
            }
        }

        //lie

        for (int i = 0; i < board.length; i++) {

            char[] a = new char[board.length];
            for (int j = 0; j < board.length; j++) {

                a[j] = board[j][i];
            }

            if (isRepeat(a)) {
                return false;
            }
        }

        //宫格

        for (int i = 0; i < 3 ; i++) {

            for (int j = 0; j < 3; j++) {

                char[] a = new char[board.length];

                int m = i * 3;
                int n = j * 3;

                for (int k = 0; k < 9; k++) {

                    a[k] = board[(m + k / 3)][(n + k % 3 )];
                }

                if (isRepeat(a)) {
                    return false;
                }

            }
        }


        return true;

    }

    static  public boolean isRepeat(char[] a) {

        HashSet<String> set = new HashSet();

        for (int i = 0; i < a.length; i++) {

            char ca = a[i];
            String key = String.valueOf(ca);

            if (set.contains(key) && ca != '.') {

                return true;

            } else {
                set.add(key);
            }
        }

        return false;
    }


    public static void main(String[] args) {
        // write your code her

        char[][] nums1 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };



        System.out.println(isValidSudoku(nums1));
    }

}
