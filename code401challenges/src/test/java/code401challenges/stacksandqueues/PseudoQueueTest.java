package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test public void testPseudoQueueEnqueue() {
        PseudoQueue pq = new PseudoQueue();
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);

        System.out.println(pq.s1.top.next.value);
        assertEquals("should instantiate PseudoQueue with values in correct order", 1, pq.s1.peek());
        assertEquals("should instantiate PseudoQueue with values in correct order", 2, pq.s1.top.next.value);
        assertEquals("should instantiate PseudoQueue with values in correct order", 3, pq.s1.top.next.next.value);


    }

    @Test public void testPseudoQueueDequeue() {
        PseudoQueue pq = new PseudoQueue();
        pq.enqueue(7);
        pq.enqueue(8);
        pq.enqueue(9);

        System.out.println(pq.s1.top.next.value);
        assertEquals("should instantiate PseudoQueue and return first value upon dequeue", 7, pq.dequeue());
    }
}
