import java.util.LinkedList;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements to the Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Display the Stack
        System.out.println("Stack: " + stack);

        // Pop element from the top of the Stack
        System.out.println("Pop: " + stack.pop());

        // Peek at the top element without removing it
        System.out.println("Peek: " + stack.peek());

        // Check the size of the Stack
        System.out.println("Size: " + stack.size());

        // Check if the Stack is empty
        System.out.println("Is Empty? " + stack.isEmpty());
    }
}

// Generic Stack class with basic operations
class Stack<T> {
    private LinkedList<T> items = new LinkedList<>();

    public void push(T item) {
        items.addFirst(item); // Add to the top of the Stack
    }

    public T pop() {
        if (!isEmpty()) {
            return items.removeFirst();
        }
        return null;
    }

    public T peek() {
        return isEmpty() ? null : items.getFirst();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
