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
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public boolean includes(int target) {
        Node runner = head;

        while (runner.next != null) {
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
}
