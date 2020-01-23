package code401challenges.utilities;

import code401challenges.linkedList.LinkedList;
import org.junit.Test;

import static code401challenges.utilities.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation() {
        String a = "{}(){}";
        String b = "(){}[[]]";
        String g = "()[[Extra Characters]]";
        String f = "{(})";
        String x = "[({}]";
        String y = "(](";

        assertTrue("should return true for valid multi-brackets", multiBracketValidation(a));
        assertTrue("should return true for valid multi-brackets", multiBracketValidation(b));
        assertTrue("should return true for valid multi-brackets", multiBracketValidation(g));
        assertFalse("should return false for invalid multi-brackets", multiBracketValidation(f));
        assertFalse("should return false for invalid multi-brackets", multiBracketValidation(x));
        assertFalse("should return false for invalid multi-brackets", multiBracketValidation(y));

    }
}
