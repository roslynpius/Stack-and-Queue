import java.util.LinkedList;

// Generic class for implementing Stack using a LinkedList
class Stack<T> {
    private LinkedList<T> list;

    // Constructor to initialize the LinkedList
    public Stack() {
        list = new LinkedList<>();
    }

    /**
     *
     * @param data The element to be pushed onto the stack.
     * @desc Pushes an element onto the stack.
     */
    public void push(T data) {
        // Adding the element to the front of the LinkedList
        list.addFirst(data);
    }

    /**
     *
     * @desc Peeks at the element on the top of the stack.
     * @return The element at the top of the stack.
     */
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return list.getFirst();
    }

    /**
     *
     * @desc Pops an element from the stack.
     * @return The element popped from the stack.
     */
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return list.removeFirst();
    }

    /**
     *
     * @desc Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     *
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
        integerStack.push(70);
        integerStack.push(30);
        integerStack.push(56);

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
