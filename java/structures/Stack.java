import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> items = new ArrayList<>();

    public void push(int item) { items.add(item); }
    public int pop() { return items.isEmpty() ? -1 : items.remove(items.size()-1); }
    public boolean isEmpty() { return items.isEmpty(); }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1); stack.push(2); stack.push(3);
        System.out.println("Pop: " + stack.pop());
    }
}
