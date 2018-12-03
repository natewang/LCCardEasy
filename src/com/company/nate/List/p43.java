
//反转一个单链表。
//
//        示例:
//
//        输入: 1->2->3->4->5->NULL
//        输出: 5->4->3->2->1->NULL

package com.company.nate.List;

public class p43 {

    static public ListNode reverseList(ListNode head) {

        ListNode pReversedHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while(pNode != null)
        {
            ListNode pNext = pNode.next;

            if(pNext == null)
                pReversedHead = pNode;

            pNode.next = pPrev;

            pPrev = pNode;
            pNode = pNext;
        }

        return pReversedHead;
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

        head = reverseList(head);

        head.print();
    }


}
