public class sortArray {
    public static void main(String[] args) {
        int[] arr = {5,6,6,6,7,8};
        boolean result = sort(arr, 0);
        System.out.println("Is array sorted? " + result);
    }
    static boolean sort(int[] arr, int index) {
        // Base case: reached the end of array
        if(index == arr.length - 1) {
            return true;
        }
        
        return arr[index] <= arr[index + 1] && sort(arr, index + 1);
    }

}  

