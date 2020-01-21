package code401challenges.stacksandqueues;

import code401challenges.stacksandqueues.Node;
import code401challenges.stacksandqueues.Stack;

import java.util.EmptyStackException;

public class PseudoQueue {
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    public PseudoQueue() {};

    public void enqueue(int val) {
        if (this.s1.isEmpty()) {
            this.s1.push(val);
        } else {
            while (!this.s1.isEmpty()) {
                this.s2.push(this.s1.pop());
            }
            this.s1.push(val);
            while (!this.s2.isEmpty()) {
                this.s1.push(this.s2.pop());
            }
        }
    }

    public int dequeue() {
        int target;

        if (this.s1.isEmpty()) {
            throw new EmptyStackException();
        } else {
            while (!this.s1.isEmpty()) {
                this.s2.push(this.s1.pop());
            }
            target = this.s2.pop();
            while (!this.s2.isEmpty()) {
                this.s1.push(this.s2.pop());
            }
            return target;
        }
    }
}