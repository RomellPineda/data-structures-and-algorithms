package code401challenges;

import code401challenges.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test public void testInstantiateLinkedList() {
        LinkedList firstLl = new LinkedList();
        firstLl.insert(100);
        firstLl.insert(99);
        firstLl.insert(98);
        firstLl.insert(97);
        firstLl.insert(96);
        firstLl.insert(95);
        firstLl.insert(94);

        assertTrue(firstLl.includes(100));
        assertFalse(firstLl.includes(92));
    }

    @Test public void testStringLinkedList() {
        LinkedList firstLl = new LinkedList();
        firstLl.insert(100);
        firstLl.insert(99);
        firstLl.insert(98);

        String output = "{98} -> {99} -> {100} -> NULL";
        assertEquals(output, firstLl.toString());
    }

    @Test public void testAppendLinkedList() {
        LinkedList sl = new LinkedList();
        sl.insert(100);
        sl.insert(99);
        sl.append(50);

        String output = "{99} -> {100} -> {50} -> NULL";
        assertEquals(output, sl.toString());
    }

    @Test public void testInsertBeforeLinkedList() {
        LinkedList sl = new LinkedList();
        sl.insert(100);
        sl.insert(99);
        sl.insert(98);
        sl.insert(97);
        sl.insert(96);
        sl.insertBefore(99, 50);

        String output = "{96} -> {97} -> {98} -> {50} -> {99} -> {100} -> NULL";
        assertEquals(output, sl.toString());
    }

    @Test public void testInsertAfterLinkedList() {
        LinkedList sl = new LinkedList();
        sl.insert(100);
        sl.insert(99);
        sl.insert(98);
        sl.insert(97);
        sl.insert(96);
        sl.insertAfter(97, 50);

        String output = "{96} -> {97} -> {50} -> {98} -> {99} -> {100} -> NULL";
        assertEquals(output, sl.toString());
    }

    @Test public void testFromLast() {
        LinkedList sl = new LinkedList();
        sl.insert(100);
        sl.insert(99);
        sl.insert(98);
        sl.insert(97);
        sl.insert(96);

        assertEquals(97, sl.fromLast(3));
    }
}
