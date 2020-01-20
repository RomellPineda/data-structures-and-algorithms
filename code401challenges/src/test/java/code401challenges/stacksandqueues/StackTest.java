package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test public void testStackInstance() {
        Stack firstStack = new Stack();
        assertEquals("should return top equal to null", null, firstStack.top);
    }

    @Test public void testStackPush() {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        assertEquals("should return value of top node", 1, s.top.value);
    }

    @Test public void testStackPop() {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        s.pop();
        s.pop();
        s.pop();

        assertEquals("should return value of popped node", 4, s.pop());
        assertEquals("should return value of new top node", 5, s.top.value);
    }

    @Test public void testStackPeek() {
        Stack s = new Stack();
        Stack otherS = new Stack();

        s.push(99);
        otherS.push(55);

        assertEquals("should return correct stack top value", 99, s.peek());

    }

    @Test public void testStackIsEmpty() {
        Stack s = new Stack();
        s.push(5);
        assertEquals("should return current top value", 5, s.peek());

        s.pop();
        assertTrue("should return true after pop operation executed", s.isEmpty());
    }
}
