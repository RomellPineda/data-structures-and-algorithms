package code401challenges.stacksandqueues;

public class Node {
    int value;
    Node next;

    public Node(int val) {
        this(val, null);
    }

    public Node(int val, Node next) {
        this.value = val;
        this.next = next;
    }
}