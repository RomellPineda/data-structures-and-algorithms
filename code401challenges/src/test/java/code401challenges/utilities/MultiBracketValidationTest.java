package code401challenges.utilities;

import code401challenges.linkedList.LinkedList;
import org.junit.Test;

import static code401challenges.utilities.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation() {
        String g = "()[[Extra Characters]]";
        String f = "([{";

        System.out.println(multiBracketValidation(f));
        assertTrue(multiBracketValidation(g));
        assertFalse(multiBracketValidation(f));
    }
}
