package com.company.nate.String;

public class p3 {

    static public int firstUniqChar(String s) {

        char[] arr = s.toCharArray();

        if (arr.length == 1) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {

            char target = arr[i];

            boolean hasSame = false;

            for (int j = 0; j < arr.length; j++) {

                if (target == arr[j] && i != j) {
                    hasSame = true;
                    break;
                }
            }

            if (!hasSame) {

                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int str =  firstUniqChar("dddccdbba");
        System.out.println(str);
    }
}
