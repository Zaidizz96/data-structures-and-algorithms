package datastructures.pseudoQueue;
import dataStructures.pseudoQueue.PseudoQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPseudoQueue {

    @Test void testPseudo_Queue_Enqueue(){
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(pseudoQueue , 4);
        pseudoQueue.enqueue(pseudoQueue , 7);

        String expected = "7 , 4";
        assertEquals(expected , pseudoQueue.stack1.print()); // ensure that stack 1 is filling
    }
    @Test void testPseudo_Queue_Dequeue(){
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(pseudoQueue , 1); // ->front
        pseudoQueue.enqueue(pseudoQueue , 2);
        pseudoQueue.enqueue(pseudoQueue , 3); // ->back

        assertEquals(pseudoQueue.dequeue(pseudoQueue) , 1);

        // we can check also in stack 1 become empty after dequeue
        assertTrue(pseudoQueue.stack1.isEmpty());
    }
}
