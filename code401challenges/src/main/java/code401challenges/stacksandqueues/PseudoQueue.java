package code401challenges.stacksandqueues;

import code401challenges.stacksandqueues.Node;
import code401challenges.stacksandqueues.Stack;

import java.util.EmptyStackException;

public class PseudoQueue {
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    public PseudoQueue() {};

    public void enqueue(int val) {
        this.s1.push(val);
    }

    public int dequeue() {
        int pseudoFirst;

        if (this.s1.isEmpty()) {
            throw new EmptyStackException();
        } else {
            while (!this.s1.isEmpty()) {
                this.s2.push(this.s1.pop());
            }
            pseudoFirst = s2.pop();
            while (!this.s2.isEmpty()) {
                this.s1.push(this.s2.pop());
            }
            return pseudoFirst;
        }
    }
}