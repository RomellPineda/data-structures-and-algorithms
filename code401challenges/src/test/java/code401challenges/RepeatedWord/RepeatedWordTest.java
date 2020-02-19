package code401challenges.RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    
    @Test
    public void testRepeatWord() {
        String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String output = RepeatedWord.repeatWord(test);
        assertEquals("should return correct repeating word", "it", output);
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