
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
          newnode.next=null;
        if(head==null){
            head=newnode;
            size++;
            return;
        }
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newnode.prev=temp;
        temp.next=newnode;
        size++;
    }

    public void insertAtIndex(int index, int val){
        if(index==0){
            insertFirst(val);
            size++;
            return;
        }
        if(index==size-1){
            insertLast(val);
            size++;
            return;
        }
        Node newnode=new Node(val);
        Node prevnode=get(index);
        newnode.next=prevnode.next;
        newnode.prev=prevnode;
        if(prevnode.next!=null){
            prevnode.next.prev=newnode;
        }
        prevnode.next=newnode;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index-1;i++){
            node=node.next;
        }
        return node;
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
