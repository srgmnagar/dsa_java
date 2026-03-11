public class LL{
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node newnode=new Node(val,head);
        head=newnode;
        if(tail==null){
            tail=newnode;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node newnode=new Node(val);
        tail.next=newnode;
        tail=newnode;
        size++;
    }

    public void insertAtIndex(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        int count=0;
        while(count!=index-1){
            temp=temp.next;
            count++;
        }
        Node newnode=new Node(val, temp.next);
        temp.next=newnode;
    }

    void deleteFirst(int val){
        
    }

    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next){
            this.val=val;
            this.next=next;   
        }
    }

}