import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        
        System.out.println("Insertion");
        que.add(3);
        que.add(1);
        que.add(9);
        que.add(5);
        que.add(2);

        System.out.println("Deletion");
        System.out.println(que.remove());

    }
    
}
