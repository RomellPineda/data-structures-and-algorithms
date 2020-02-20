package code401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testHashtable() {
        Hashtable<String, Integer> smashTable = new Hashtable<>();
        smashTable.add("pancake", 42);
        System.out.println(smashTable.get("pancake"));
    }
}