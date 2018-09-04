package com.company.nate.String;

public class p8 {

    static public String countAndSay(int n) {

        String lastStr = "1";

        for (int i = 1; i < n; i++) {

            char[] arr = lastStr.toCharArray();

            String resultStr = "";
            char lastChar = arr[0];
            int count = 1;
            for (int j = 1; j < arr.length; j++) {

                if (arr[j] != lastChar) {

                    resultStr = resultStr + count + String.valueOf(lastChar);

                    lastChar = arr[j];
                    count = 1;

                } else {
                    count++;
                }
            }

            lastStr = resultStr + count + String.valueOf(lastChar);

        }

        return lastStr;
    }


    public static void main(String[] args) {

        String bool = countAndSay(4);
        System.out.println(bool);
    }



}
