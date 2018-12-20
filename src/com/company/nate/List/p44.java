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

        if (l1.val > l2.val) {
            node = l2;
            node.next = l1;
        } else {
            node = l1;
            node.next = l2;
        }

        ListNode node1 = l1.next;
        ListNode node2 = l2.next;

        ListNode headNode = node;

        while (node1 != null || node2 != null) {

            if (node1 == null) {
               node.next = node2 ;

                node1 = node1.next;
                node2 = node2.next;

                node.next.next = null;
                continue;
            }

            if (node2 == null) {
                node.next = node1;

                node1 = node1.next;
                node2 = node2.next;

                node.next.next = null;
                continue;
            }

            if (node1.val > node2.val) {
                node.next = node2 ;
                node.next.next = node1;

                node1 = node1.next;
                node2 = node2.next;
                node.next.next = null;
            } else {
                node.next = node1;
                node.next.next = node2;

                node1 = node1.next;
                node2 = node2.next;

                node.next.next = null;
            }
        }

        return headNode;
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
