package code401challenges;

import code401challenges.linkedList.LinkedList;
import org.junit.Test;

import java.util.StringJoiner;

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

    @Test public void testMergeList() {
        LinkedList sl = new LinkedList();
        sl.insert(9);
        sl.insert(7);
        sl.insert(5);
        sl.insert(3);
        sl.insert(1);
        System.out.println(sl.toString());

        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(8);
        ll.insert(6);
        ll.insert(4);
        ll.insert(2);
        System.out.println(ll.toString());


        sl.mergeList(sl.head, ll.head);
        System.out.println(sl.toString());
        String output = "{1} -> {2} -> {3} -> {4} -> {5} -> {6} -> {7} -> {8} -> {9} -> {10} -> NULL";
        assertEquals(output, sl.toString());
    }

    @Test public void testIncludes() {
        LinkedList sl = new LinkedList();
        sl.insert(9);
        sl.insert(7);
        sl.insert(5);
        sl.insert(3);
        sl.insert(1);

        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(8);
        ll.insert(6);
        ll.insert(4);
        ll.insert(2);

        sl.mergeList(sl.head, ll.head);
        assertTrue(sl.includes(6));
    }
}
