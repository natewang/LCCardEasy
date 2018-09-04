package com.company.nate.String;

public class p9 {

    static public String longestCommonPrefix(String[] strs) {

        String resultStr = "";

        if(strs.length ==0) {
            return resultStr;
        }

        String firstStr = strs[0];
        for (int i = 0; i < firstStr.length(); i++) {

            char indexChar = firstStr.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                String str = strs[j];
                if (str.length()  > i) {

                    if (str.charAt(i) == indexChar) {
                    } else  {
                        return resultStr;
                    }

                } else {
                    return resultStr;
                }
            }

            resultStr = resultStr + indexChar;
        }

        return resultStr;
    }


    public static void main(String[] args) {

        String[] strs = {"ddog","ddracecar","ddcar"};
        String bool = longestCommonPrefix(strs);
        System.out.println(bool);
    }

}
