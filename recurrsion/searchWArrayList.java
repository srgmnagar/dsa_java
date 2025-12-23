import java.util.ArrayList;
import java.util.Arrays;

public class searchWArrayList {
    public static void main(String[] args) {
          int arr[]=new int[]{2,32,3,5,6,7,2};
        int target = 2;
        ArrayList<Integer> list = new ArrayList<>();
        // list=search(arr, 0, target, new ArrayList<>());
        list=search2(arr, 0, target );
        System.out.println(list);
       
    }
    static ArrayList<Integer> search(int arr[], int index, int target, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return search(arr, index+1, target, list);
    }
    static ArrayList<Integer> search2(int arr[], int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }   
        if(arr[index]==target){
            list.add(index);
        }
        ;
        list.addAll(search2(arr, index+1, target));
        return list;
    }
    
}
