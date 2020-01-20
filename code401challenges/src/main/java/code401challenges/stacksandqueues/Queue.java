package code401challenges.stacksandqueues;

import code401challenges.stacksandqueues.Node;

import java.util.EmptyStackException;

public class Queue {
    Node front;

    public Queue() {};

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (this.front == null) {
            front = newNode;
        } else {
            Node runner = front;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public int dequeue() {
        if (this.front == null) {
            throw new EmptyStackException();
        } else {
            Node current = front;
            front = current.next;
            current.next = null;
            return current.value;
        }
    }

    public int peek() {
        if (this.front == null) {
            throw new EmptyStackException();
        };
        return this.front.value;
    }

    public boolean isEmpty() {
        return this.front == null;
    }
}