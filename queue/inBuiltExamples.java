import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class inBuiltExamples {
    public static void main(String[] args) {
        // Queue<Integer> queue=new LinkedList<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // System.out.println(queue);
        // System.out.println(queue.peek());
        
        // System.out.println(queue.remove());
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addLast(1);
        deque.addLast(2);   
        deque.addFirst(3);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);

    }
}
