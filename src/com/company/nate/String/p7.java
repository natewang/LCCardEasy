package com.company.nate.String;

public class p7 {

    static public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) return 0;

        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        char firstChar = needleArr[0];
        for (int i = 0; i < haystackArr.length; i++) {

            if (haystackArr[i] == firstChar) {

                if (haystackArr.length - i >= needleArr.length) {

                    boolean find = true;
                    for (int j = 1; j < needleArr.length; j++) {

                        if (haystackArr[i + j] != needleArr[j]) {
                            find = false;
                            break;
                        }
                    }

                    if (find) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int bool = strStr("mississippi", "issip");
        System.out.println(bool);
    }

}
