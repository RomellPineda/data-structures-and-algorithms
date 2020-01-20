package code401challenges.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    @Test public void testQueueInstance() {
        Queue firstQ = new Queue();
        assertEquals("should return front node of null", null, firstQ.front);
    }

    @Test public void testQueueEnqueue() {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        assertEquals("should return front node of null", 1, q.front.value);
    }

    @Test public void testQueueDequeue() {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);

        q.dequeue();
        assertEquals("should return correct dequeue value", 2, q.dequeue());
    }

    @Test public void testQueuePeek() {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        assertEquals("should return current value of first node", 1, q.peek());
    }

    @Test public void testQueueIsEmpty() {
        Queue q = new Queue();
        q.enqueue(1);
        assertFalse("should return false when queue is not empty", q.isEmpty());

        q.dequeue();
        assertTrue("should return true when queue is empty", q.isEmpty());
    }
}
