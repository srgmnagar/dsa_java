public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=3;
    int ptr=-1;
    public customStack(){
        this(DEFAULT_SIZE);
    } 
    public customStack(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
    }
    data[++ptr]=item;
    return true;
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return data[ptr];
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return data[ptr--];
    }
}
