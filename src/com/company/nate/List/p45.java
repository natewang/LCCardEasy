package com.company.nate.List;

public class p45 {


    static  private  ListNode reverseList(ListNode head) {

        ListNode prev = null;
        while (head != null) {

            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;

    }


    static  private  ListNode findMinddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode p = head, q = head.next;
        while (q != null && q.next != null) {

            p = p.next;
            q = q.next.next;
        }

        return p;
    }

    static public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null)
            return true;

        ListNode middle = findMinddle(head);
        middle.next = reverseList(middle.next);

        ListNode p = head, q = middle.next;
        while(p!=null && q!=null && p.val==q.val){
            p = p.next;
            q = q.next;
        }

        return q==null;

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

        System.out.println(isPalindrome(head));
    }
}
