public class dynamicQueue extends circularQueue {
     public dynamicQueue(){
        super();
    }
    public dynamicQueue(int size){
        super(size);
    }
    public boolean insert(int item){
        if(isFull()){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front+i)%data.length];
            }
            data=temp;
            front=0;
            end=data.length/2;
        }
        return super.insert(item);
    }
}
