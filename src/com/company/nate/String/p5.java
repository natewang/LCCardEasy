package com.company.nate.String;

public class p5 {

    static public boolean isPalindrome(String s) {


        char[] arr = s.toCharArray();

        int i = 0, j = arr.length - 1;

        while (i < j) {

            if (!isCharRight(arr[i])) {
                i++;
                continue;
            }

            if (!isCharRight(arr[j])) {

                j--;
                continue;
            }

            if ((arr[i] + 32 - 'a' ) % 32 != (arr[j] +32 - 'a') % 32) {

                return false;
            }

            i++;
            j--;

        }

        return true;
    }

    static public boolean isCharRight(char a) {

        if( a >= '0' && a <= '9'  ) {
            return true;
        }

        if (a >= 'a' && a <= 'z') {
            return true;
        }

        if (a >= 'A' && a <= 'Z') return true;


        return false;
    }


    public static void main(String[] args) {

        boolean bool = isPalindrome("0P");
        System.out.println(bool);
    }

}
