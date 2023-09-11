package datastructures.stack_queue_brackets;


import dataStructures.stack_queue_brackets.BracketValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MultiBracketTest {
    @Test
    public void testValidBrackets() {
        BracketValidator bracketValidator = new BracketValidator();
        assertTrue(bracketValidator.validateBrackets("()"));
        assertTrue(bracketValidator.validateBrackets("()[]{}"));
        assertTrue(bracketValidator.validateBrackets("{[()]}"));
        assertTrue(bracketValidator.validateBrackets(""));
    }

    @Test
    public void testInvalidBrackets() {
        BracketValidator bracketValidator = new BracketValidator();
        assertFalse(bracketValidator.validateBrackets("(]"));
        assertFalse(bracketValidator.validateBrackets("([)]"));
        assertFalse(bracketValidator.validateBrackets("{"));
        assertFalse(bracketValidator.validateBrackets("}"));
        assertFalse(bracketValidator.validateBrackets("{{{{{{"));
        assertFalse(bracketValidator.validateBrackets("}}}}}}"));
    }
}

