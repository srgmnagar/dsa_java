
public class SLL{
    private Node head;
    private Node tail;
    private int size;

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

    public SLL(){
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
        size++;
    }

    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    
    public int deleteLast(){
        int val;
        if(size<=1){
            val=head.val;
            deleteFirst();
            return val;
        }
        Node secondLast=get(size-2);
        val=tail.val;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteAtIndex(int index){
        int val;
        if(index==0){
            val=deleteFirst();
            return val;
        }
        if(index==size-1){
            val=deleteLast();
            return val;
        }
        Node node=get(index-1);
        val=node.next.val;
        node.next=node.next.next;
        size--;
        return val;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public void bubble(){
        bubbleSort(size-1, 0);
    }

    private void bubbleSort(int row, int col){
        if(row==0){
            return;
        }
        else if(col<row){
            Node first=get(col);
            Node sec=get(col+1);
            if(first.val>sec.val){
                if(first==head){
                    head=sec;
                    first.next=sec.next;
                    sec.next=first;
                }
                else if(sec==tail){
                    Node prev=get(col-1);
                    prev.next=sec;
                    tail=first;
                    sec.next=first;
                    first.next=null;
                }
                else{
                    Node prev=get(col-1);
                    first.next=sec.next;
                    sec.next=first;
                    prev.next=sec;
                }
            }
            bubbleSort(row, col+1);

            }
            else{
                bubbleSort(row-1, 0);
            }
        }   
       

    public void insertRec(int index,int val){
        head=rec(head,index,val);
    }

    private Node rec(Node node,int index, int val){
        if(index==0){
            Node newnode=new Node(val);
            newnode.next=node;
            size++;
            return newnode;
        }
        node.next=rec(node.next,--index,val);
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

   

}