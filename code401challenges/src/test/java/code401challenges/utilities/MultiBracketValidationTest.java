package code401challenges.utilities;

import code401challenges.linkedList.LinkedList;
import org.junit.Test;

import static code401challenges.utilities.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation1() {
        String a = "{}(){}";
        assertTrue("should return true for valid multi-brackets", multiBracketValidation(a));
    }

    @Test
    public void testMultiBracketValidation2() {
        String b = "(){}[[]]";
        assertTrue("should return true for valid multi-brackets", multiBracketValidation(b));
    }

    @Test
    public void testMultiBracketValidation3() {
        String g = "()[[Extra Characters]]";
        assertTrue("should return true for valid multi-brackets", multiBracketValidation(g));
    }

    @Test
    public void testMultiBracketValidation4() {
        String f = "{(})";
        assertFalse("should return false for invalid multi-brackets", multiBracketValidation(f));
    }

    @Test
    public void testMultiBracketValidation5() {
        String x = "[({}]";
        assertFalse("should return false for invalid multi-brackets", multiBracketValidation(x));
    }

    @Test
    public void testMultiBracketValidation() {
        String y = "(](";
        assertFalse("should return false for invalid multi-brackets", multiBracketValidation(y));
    }
}
