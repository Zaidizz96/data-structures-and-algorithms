package datastructures.stack;

import dataStructures.stack.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {


    @Test void check_push_Stack(){
        Stack stack = new Stack();
        stack.push(4);
        stack.push(7);

       assertFalse(stack.isEmpty());
    }
    @Test void check_Push_Multiple_Items_Stack(){
        Stack stack = new Stack();
        stack.push(4);
        stack.push(7);
        stack.push(9);
        stack.push(2);

        String expected = "2 , 9 , 7 , 4";
        assertEquals(expected , stack.print());
    }
    @Test void check_Pop_Stack(){
        Stack stack = new Stack();
        stack.push(4);
        stack.push(7);
        stack.push(9);
        stack.push(2);
        stack.pop();

        String expected = "9 , 7 , 4";
        assertEquals(expected , stack.print());
    }
    @Test void check_Multiple_Pops_Can_Empty_theStack(){
        Stack stack = new Stack();
        stack.push(4);
        stack.push(7);
        stack.push(9);
        stack.push(2);

        stack.pop(); stack.pop(); stack.pop() ; stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    void check_Peek_Pop_Empty_stack(){
        try {
            Stack stack = new Stack();
            stack.pop();
        }catch (Exception e){
           String expected = e.getMessage();
            assertEquals("The Stack is Empty" , expected );
        }
    }
}
