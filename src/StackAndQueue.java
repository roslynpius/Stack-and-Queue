import java.util.LinkedList;

// Generic class for implementing Queue using a LinkedList
class Queue<T> {
    private LinkedList<T> list;

    // Constructor to initialize the LinkedList
    public Queue() {
        list = new LinkedList<>();
    }

    /**
     *
     * @param data The element to be enqueued.
     * @desc Enqueues an element into the queue.
     */
    public void enqueue(T data) {
        // Adding the element to the end of the LinkedList
        list.add(data);
    }

    /**
     *
     * @desc Dequeues an element from the queue.
     * @return The element dequeued from the queue.
     */
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return list.removeFirst();
    }

    /**
     *
     * @desc Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     *
     * @desc Prints the elements of the queue.
     */
    public void printQueue() {
        System.out.print("Queue: ");
        for (T data : list) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}

public class StackAndQueue {
    public static void main(String[] args) {
        // Creating a queue of integers
        Queue<Integer> integerQueue = new Queue<>();

        // Enqueuing elements into the queue
        integerQueue.enqueue(56);
        integerQueue.enqueue(30);
        integerQueue.enqueue(70);

        // Printing the initial queue
        System.out.println("Initial Queue:");
        integerQueue.printQueue();

        // Dequeuing elements from the queue until it is empty
        System.out.println("Dequeue until the queue is empty:");
        while (!integerQueue.isEmpty()) {
            System.out.println("Dequeue: " + integerQueue.dequeue());
        }
    }
}
