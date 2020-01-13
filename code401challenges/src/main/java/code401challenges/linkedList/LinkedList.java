package code401challenges.linkedList;

public class LinkedList {

    public Node head;

    public class Node {
        public Node next;
        public Integer val;

        public Node(Integer val) {
            this.val = val;
            this.next = null;
        }
    }

    public void insert(Integer val) {
        Node fresh = new Node(val);
        fresh = head;
        head = fresh;
    }

    public boolean includes(Integer target) {
        Node runner = head;

        while (runner.next != null) {
            if (runner.val == target) {
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

        while (runner.next != null) {
            out += "{" + runner.val + "} -> ";
        }
        out += "NULL";
        return out;
    }
}
