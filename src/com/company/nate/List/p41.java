package com.company.nate.List;


import java.util.List;

public class p41 {

    static public void deleteNode(ListNode node) {


        ListNode pNode = node;

        while (pNode.next != null) {

            pNode.val = pNode.next.val;

            if(pNode.next.next != null) {
                pNode = pNode.next;
            } else {
                break;
            }
        }

        pNode.next = null;
    }

    public static void main(String[] args) {

        int[] arr = {4,5,1,9};
        ListNode head = new ListNode(arr[0]);

        ListNode pNode = head;
        ListNode delete = new ListNode(5);

        for (int i = 1; i < arr.length; i++) {

            ListNode node = new ListNode(arr[i]);

            pNode.next = node;
            pNode = node;

            if (i == 1) {
                delete = node;
            }
        }

        deleteNode(delete);

        head.print();


    }
}