import java.util.ArrayList;

public class subSetArr {
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int arr[]={3,5,1};
        subset(ans,arr,0);
    }
    static void subset(ArrayList<Integer> current, int[] arr,int index){
        if(index==arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        subset(current,arr,index+1);
        current.remove(current.size()-1);
        subset(current,arr,index+1);
    }
}
