package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test public void testPseudoQueueEnqueue() {
        PseudoQueue pq = new PseudoQueue();
        pq.enqueue(1);

        assertEquals("should instantiate PseudoQueue with values in correct order", 1, pq.s1.peek());
    }

    @Test public void testPseudoQueueDequeue() {
        PseudoQueue pq = new PseudoQueue();
        pq.enqueue(7);
        pq.enqueue(8);
        pq.enqueue(9);

        assertEquals("should instantiate PseudoQueue and return first value upon dequeue", 7, pq.dequeue());
    }
}
