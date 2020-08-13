package com.company.nate.Design;

import java.util.Stack;

public class p59 {


    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public p59() {}
    public void push(int x) {
        s1.push(x);
        if (s2.isEmpty() || s2.peek() >= x) s2.push(x);
    }
    public void pop() {
        int x = s1.pop();
        if (s2.peek() == x) s2.pop();
    }
    public int top() {
        return s1.peek();
    }
    public int getMin() {
        return s2.peek();
    }

}
