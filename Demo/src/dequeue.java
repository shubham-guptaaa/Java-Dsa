import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addLast(4);
        deque.addFirst(9);
        System.out.println(deque);
    }
    
}
