package com.company.nate.List;

public class p46 {


    static public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {


        int[] arr = {1,0,0};
        ListNode head = new ListNode(arr[0]);

        ListNode pNode = head;

        for (int i = 1; i < arr.length; i++) {

            ListNode node = new ListNode(arr[i]);

            pNode.next = node;
            pNode = node;
        }



        System.out.println(hasCycle(head));
    }

}
