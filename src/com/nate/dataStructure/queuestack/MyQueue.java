package com.nate.dataStructure.queuestack;

//https://leetcode-cn.com/leetbook/read/queue-stack/kkqf1/

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

    private List<Integer> data;
    private int p_start;

    public MyQueue() {
        data = new ArrayList<>();
        p_start = 0;

    }

    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    public boolean deQueue() {

        if (isEmpty() == true) {
            return false;
        }

        p_start++;
        return true;
    }

    public int Front() {
        return data.get(p_start);
    }

    public boolean isEmpty() {

        return p_start >= data.size();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }


}
