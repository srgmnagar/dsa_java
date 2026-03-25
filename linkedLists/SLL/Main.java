
public class Main {
    public static void main(String[] args) {
        SLL list =new SLL();
        list.insertFirst(44);
        list.insertFirst(49);
        list.insertFirst(88);
        list.insertFirst(94);
        list.insertLast(100);
        list.insertAtIndex(11, 2);
        list.insertRec(6,10000);
        // System.out.println(list.deleteFirst());
        // System.out.println(list.deleteLast());
        // System.out.println(list.deleteAtIndex(1));
        list.display();
        list.bubble();
        list.display();
    }
}
