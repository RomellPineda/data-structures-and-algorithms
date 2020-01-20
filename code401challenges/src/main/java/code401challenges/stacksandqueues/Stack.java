package code401challenges.stacksandqueues;

import code401challenges.stacksandqueues.Node;

import java.util.EmptyStackException;

public class Stack {
    Node top;

    public Stack() {};

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (this.top == null) {
            throw new EmptyStackException();
        };
        Node target = top;
        top = target.next;
        target.next = null;
        return target.value;
    }

    public int peek() {
        if (this.top == null) {
            throw new EmptyStackException();
        }
        return this.top.value;
    }

    public boolean isEmpty() {
        return this.top == null;
    }
}