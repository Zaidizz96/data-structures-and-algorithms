package datastructures.queue;

import dataStructures.queue.Queue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test void check_Enqueue_In_Queue(){
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(5);

        assertFalse(queue.isEmpty());
    }
    @Test void check_Enqueue_Multiple_Items_Queue(){
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(4);

        String expected = "3 , 5 , 8 , 4";
        assertEquals(expected , queue.print());
    }
    @Test void check_Successfully_Dequeue(){
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(4);
        queue.dequeue();
        String expected = "5 , 8 , 4";
        assertEquals(expected , queue.print());
    }
    @Test void check_Peek_To_Queue(){
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(5);
        assertEquals(queue.peek() , 3);
    }
    @Test void check_Peek_Pop_In_Empty_Queue(){
        try{
            Queue queue = new Queue();
            queue.peek();
        }catch (Exception e){
            String actual = e.getMessage();
            assertEquals("The Queue is Empty" , actual);
        }
    }
}
