public class queueMain {
    public static void main(String[] args) {
        customQueue q = new customQueue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        System.out.println();
        q.display();
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.display();
    }
}
