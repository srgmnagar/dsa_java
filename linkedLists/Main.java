public class Main {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(44);
        list.insertFirst(49);
        list.insertFirst(88);
        list.insertFirst(94);
        list.insertLast(100);
        list.insertAtIndex(11, 2);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.deleteAtIndex(1));
        list.display();
    }
}
