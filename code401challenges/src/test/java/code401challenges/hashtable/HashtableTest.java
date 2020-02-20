package code401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testHashtable() {
        Hashtable<String, Integer> smashTable = new Hashtable<>();
        smashTable.add("pancake", 42);
        smashTable.add("pineapple", 99);
        smashTable.add("frenchFry", 6);
        smashTable.add("coconuts", 101);
        smashTable.add("waffles", 13);
        smashTable.add("sake", 56);
        int output = smashTable.get("coconuts");
        assertEquals("should return correct value associated with key", 101, output);
    }
}