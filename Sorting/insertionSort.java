public class insertionSort {
     public static int[] sortArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
            
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] sorted = sortArray(arr);

        System.out.print("Sorted array: ");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
