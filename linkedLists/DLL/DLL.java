
public class DLL {
    Node head;
    int size;

    public void insertFirst(int val){
        Node newnode=new Node(val);
        newnode.next=head;
        newnode.prev=null;
        if(head!=null){
            head.prev=newnode;
        }
        head=newnode;
        size++;
    }

      public void insertLast(int val){
        Node newnode=new Node(val);
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newnode.prev=temp;
        newnode.next=null;
        temp.next=newnode;
        size++;
    }

    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public void displayReverse(){
        Node temp =head;
        Node last=null;
        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        while(last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("NULL");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
         public Node(int val, Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;   
        }
    }
}
