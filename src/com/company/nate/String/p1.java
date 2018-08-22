package com.company.nate.String;

public class p1 {

    static public String reverseString(String s) {

        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length / 2; i++) {

            char temp = charArr[i];
            charArr[i] = charArr[charArr.length - 1 - i];
            charArr[charArr.length - 1 - i] = temp;
        }

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {

        String str =  reverseString("abcdefg");
        System.out.println(str);

    }
}
