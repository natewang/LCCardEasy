package com.company.nate.List;

public class p44 {


    static public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head;

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {

            head = l1;
            head.next = mergeTwoLists(l1.next, l2);

        } else {

            head = l2;
            head.next = mergeTwoLists(l2.next, l1);

        }


        return head;
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


        ListNode head2 = new ListNode(arr[0]);
        pNode = head2;

        for (int i = 1; i < arr.length; i++) {

            ListNode node = new ListNode(arr[i]);

            pNode.next = node;
            pNode = node;
        }

        ListNode mergeHead = mergeTwoLists(head, head2);

        mergeHead.print();
    }

}
