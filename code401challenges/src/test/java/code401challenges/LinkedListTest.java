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
        firstLl.insert(99);

        System.out.println(firstLl.toString());
        assertTrue(firstLl.includes(100));
        assertFalse(firstLl.includes(92));
    }

    @Test public void testStringLinkedList() {
        LinkedList firstLl = new LinkedList();
        firstLl.insert(100);
        firstLl.insert(99);
        firstLl.insert(98);

        String output = "{100} -> {99} -> {98} -> NULL";
        assertEquals(output, firstLl.toString());
    }
}
