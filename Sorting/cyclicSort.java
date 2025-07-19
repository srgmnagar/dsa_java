public class cyclicSort {
    public static void sortArray(int[] arr) {
        int i = 0;
       while(i<arr.length){
        if (arr[i] != i + 1) {
            int temp = arr[i];
            arr[i] = arr[temp - 1];
            arr[temp - 1] = temp;
        } else {
            i++;
        }
       }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sortArray(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
