public class RBS {
    public static void main(String[] args) {
        int[] arr = {7,8,1,2,3,4,5,6};
        int target = 1;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr, int target,int start,int end) {
        int mid=start+(end-start)/2;
        if(start > end) {
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[start]<=arr[mid]){
            if(target<arr[mid]&&target>=arr[start]){
                return search(arr,target,start,mid-1);
            }
            else{
                return search(arr,target,mid+1,end);
            }
        }
        else{
            if(target>=arr[mid]&&target<=arr[end]){
                return search(arr,target,mid+1,end);
            }
            else{
                return search(arr,target,start,mid-1);
            }
        }
    }
}
