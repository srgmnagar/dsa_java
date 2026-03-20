

public class main {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);
        list.insertFirst(11);
        list.insertLast(34);
        list.insertAtIndex(2,44);
        list.display();
    
        // list.displayReverse();
    }
}
