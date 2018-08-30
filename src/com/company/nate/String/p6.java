package com.company.nate.String;

import java.util.ArrayList;

public class p6 {


    static public int myAtoi(String str) {

        ArrayList<Character> intCharArr = new ArrayList<>();
        boolean isPos = true;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ' ') {
                if (intCharArr.size() == 0) {
                    continue;
                } else {
                    break;
                }
            }

            if (arr[i] == '-') {

                if (intCharArr.size() == 0) {

                    intCharArr.add(arr[i]);
                    isPos = false;
                    continue;
                } else {
                    break;
                }
            }

            if (arr[i] == '+') {

                if (intCharArr.size() ==0) {
                    intCharArr.add(arr[i]);
                    continue;
                } else  {
                    break;
                }
            }

            if (arr[i] >= '0' && arr[i] <= '9') {

                intCharArr.add(arr[i]);
            } else {
                break;
            }
        }

        if (intCharArr.size() == 0) {
            return 0;
        }

        if(intCharArr.get(0) == '+' || intCharArr.get(0) == '-') {
            intCharArr.remove(0);
        }

        long sum =0;

        double max = Math.pow(2, 31) - 1;
        double min = -Math.pow(2, 31);

        for (int i = 0; i < intCharArr.size(); i++) {

            int value = intCharArr.get(i) - '0';

            sum += value * Math.pow(10, (intCharArr.size() - 1 - i));

            if (isPos) {
                if (sum > max) {
                    return (int) max;
                }
            } else {

                if (-sum < min) {
                    return (int) min;
                }
            }
        }

        return (int) (isPos ? sum : -sum);
    }


    public static void main(String[] args) {

        int bool = myAtoi("words and 987");
        System.out.println(bool);
    }


}
