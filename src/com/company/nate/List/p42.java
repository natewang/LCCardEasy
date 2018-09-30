package com.company.nate.List;

public class p42 {

    static public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode cur = head;
        ListNode find = null;

        while (cur != null) {

            if (count == n) {
                if (find == null) {
                    find = head;
                } else {
                    find = find.next;
                }
            } else {
                count++;
            }

            cur = cur.next;
        }

        //find的next 是要删除的

        if (find == null) {
            return head.next;
        }

        if (find.next == null) {
            return null;
        }
        find.next = find.next.next;

        return head;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
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

        head = removeNthFromEnd(head, 1);

        head.print();
    }
}
