package code401challenges.linkedList;

public class LinkedList {

    public Node head;

    public LinkedList() {};

    static class Node {
        public Node next;
        public int value;

        public Node(int val) {
            this.value = val;
            this.next = null;
        }
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public boolean includes(int target) {
        Node runner = head;

        while (runner != null) {
            if (runner.value == target) {
                return true;
            } else {
                runner = runner.next;
            }
        }
        return false;
    }

    public String toString() {
        String out = "";
        Node runner = head;

        while (runner != null) {
            out += "{" + runner.value + "} -> ";
            runner = runner.next;
        }
        out += "NULL";
        return out;
    }

    public void append(int val) {
        Node newNode = new Node(val);
        Node runner = head;
        while (runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;
    }

    public void insertBefore(int target, int val) {
        Node newNode = new Node(val);
        Node runner = head;
        while (runner.next.value != target) {
            runner = runner.next;
        }
        newNode.next = runner.next;
        runner.next = newNode;
    }

    public void insertAfter(int target, int val) {
        Node newNode = new Node(val);
        Node runner = head;
        while (runner.value != target) {
            runner = runner.next;
        }
        newNode.next = runner.next;
        runner.next = newNode;
    }
}
