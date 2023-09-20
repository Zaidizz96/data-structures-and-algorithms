package dataStructures.pseudoQueue;

public interface PseudoQueueInterface<T> {
     void enqueue(PseudoQueue<T> queue, T value);
     T dequeue(PseudoQueue<T> queue);
}
