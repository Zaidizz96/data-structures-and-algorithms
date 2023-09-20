package dataStructures.pseudoQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PseudoQueueTest {

    @Test
    void testPseudoQueueEnqueue() {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(pseudoQueue, 4);
        pseudoQueue.enqueue(pseudoQueue, 7);

        String expected = "7 , 4";
        assertEquals(expected, pseudoQueue.stack1.print());
    }

    @Test
    void testPseudoQueueDequeue() {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(pseudoQueue, 1); // ->front
        pseudoQueue.enqueue(pseudoQueue, 2);
        pseudoQueue.enqueue(pseudoQueue, 3); // ->back

        assertEquals(1, pseudoQueue.dequeue(pseudoQueue));

        assertTrue(pseudoQueue.stack1.isEmpty());
    }
}
