package com.company.nate.List;

public class p44 {


    static public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode node;

        if (l1.val > )

        while (l1 != null || l2 != null) {

            if (l1 == null) {

            }

            if (l2 == null) {

            }





        }









    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        ListNode head = new ListNode(arr[0]);

        ListNode pNode = head;

        for (int i = 1; i < arr.length; i++) {

            ListNode node = new ListNode(arr[i]);

            pNode.next = node;
            pNode = node;
        }

        head = mergeTwoLists(head, head);

        head.print();
    }

}
