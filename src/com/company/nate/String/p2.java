package com.company.nate.String;

import java.util.ArrayList;

public class p2 {

    static public int reverse(int x) {

        boolean isPos = x >= 0;
        if (!isPos) {
            x = -x;
        }

        ArrayList<Integer> arr = new ArrayList();
        while (x != 0) {

            int leftValue = x % 10;
            arr.add(leftValue);

            x = x / 10;
        }

        int res = 0;

        double max = 2147483647;
        double min = -2147483647;

        for (int i = arr.size() - 1; i >= 0; i--) {

            res += Math.pow(10, i) * arr.get(arr.size() - 1 - i);

            if (isPos && res >= max) {
                return 0;
            }

            if (!isPos && -res <= min) {
                return 0;
            }
        }

        return isPos ? res : -res;
    }

    public static void main(String[] args) {

        int str =  reverse(1534236469);
        System.out.println(str);
    }

}
