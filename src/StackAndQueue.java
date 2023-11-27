import java.util.LinkedList;

// Generic class for implementing Stack using a LinkedList
class Stack<T> {
    private LinkedList<T> list;

    // Constructor to initialize the LinkedList
    public Stack() {
        list = new LinkedList<>();
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param data The element to be pushed onto the stack.
     * @desc Pushes an element onto the stack.
     */
    public void push(T data) {
        // Adding the element to the front of the LinkedList
        list.addFirst(data);
    }

    /**
     * Peeks at the element on the top of the stack.
     *
     * @return The element at the top of the stack.
     * @throws IllegalStateException if the stack is empty.
     * @desc Peeks at the element on the top of the stack.
     */
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    /**
     * Pops an element from the stack.
     *
     * @return The element popped from the stack.
     * @throws IllegalStateException if the stack is empty.
     * @desc Pops an element from the stack.
     */
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     * @desc Checks if the stack is empty.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Prints the elements of the stack.
     * @desc Prints the elements of the stack.
     */
    public void printStack() {
        System.out.print("Stack: ");
        for (T data : list) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}

public class StackAndQueue {
    public static void main(String[] args) {
        // Creating a stack of integers
        Stack<Integer> integerStack = new Stack<>();

        // Pushing elements onto the stack
        integerStack.push(56);
        integerStack.push(30);
        integerStack.push(70);

        // Printing the initial stack
        System.out.println("Initial Stack:");
        integerStack.printStack();

        // Peeking and popping elements from the stack until it is empty
        System.out.println("Peek and Pop until the stack is empty:");
        while (!integerStack.isEmpty()) {
            System.out.println("Peek: " + integerStack.peek());
            System.out.println("Pop: " + integerStack.pop());
        }
    }
}
