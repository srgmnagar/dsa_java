public class circularMain {
    public static void main(String[] args) {
        // circularQueue q = new circularQueue(5);
        dynamicQueue q = new dynamicQueue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.insert(7);
        System.out.println();
        q.display();
        System.out.println(q.remove());
        q.display();
    }
}
