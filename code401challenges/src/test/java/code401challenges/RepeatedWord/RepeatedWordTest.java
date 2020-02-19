package code401challenges.RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    
    @Test
    public void testRepeatWord() {
        String test = "This is a really really foo bar";
        String output = RepeatedWord.repeatWord(test);
        assertEquals("should return correct repeating word", "really", output);
    }

    @Test
    public void testRepeatWordEmptyString() {
        String test = "";
        String output = RepeatedWord.repeatWord(test);
        assertEquals("should return base case message", "no repeating words, brosef!", output);
    }

    @Test
    public void testRepeatWordCapitaliziedEdge() {
        String capitaliziedString = "This is a really Really foo bar";
        String output = RepeatedWord.repeatWord(capitaliziedString);
        assertEquals("should return correct repeating word", "really", output);
    }

    @Test
    public void testRepeatWordPunctuationEdge() {
        String punctuatedString = "This, is. a really; Really: foo bar foo";
        String output = RepeatedWord.repeatWord(punctuatedString);
        assertEquals("should return correct repeating word", "really", output);
    }
}