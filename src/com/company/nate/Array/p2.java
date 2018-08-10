package com.company.nate.Array;

public class p2 {

    static public int maxProfit(int[] prices) {

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int price = prices[i] - prices[i - 1];
            if (price > 0) {
                maxProfit += price;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        // write your code her

        int[] intArray = {7,1,5,3,6,4};
        System.out.println(maxProfit(intArray));
    }

}
