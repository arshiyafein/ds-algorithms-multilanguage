import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); queue.add(2); queue.add(3);
        System.out.println("Dequeue: " + queue.remove());
    }
}
