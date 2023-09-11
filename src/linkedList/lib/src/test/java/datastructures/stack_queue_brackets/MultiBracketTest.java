package datastructures.stack_queue_brackets;


import dataStructures.stack_queue_brackets.BracketValidator;
import org.junit.Test;
import static org.junit.Assert.*;


public class MultiBracketTest {
    @Test
    public void testValidBrackets() {
        assertTrue(BracketValidator.validateBrackets("()"));
        assertTrue(BracketValidator.validateBrackets("()[]{}"));
        assertTrue(BracketValidator.validateBrackets("{[()]}"));
        assertTrue(BracketValidator.validateBrackets(""));
    }

    @Test
    public void testInvalidBrackets() {
        assertFalse(BracketValidator.validateBrackets("(]"));
        assertFalse(BracketValidator.validateBrackets("([)]"));
        assertFalse(BracketValidator.validateBrackets("{"));
        assertFalse(BracketValidator.validateBrackets("}"));
        assertFalse(BracketValidator.validateBrackets("{{{{{{"));
        assertFalse(BracketValidator.validateBrackets("}}}}}}"));
    }
}

