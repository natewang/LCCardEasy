package com.company.nate.List;

public class ListNode {

    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public void print() {

        ListNode node = this;
        while (node != null)  {

            System.out.println(node.val);
            node = node.next;
        }

    }
}
