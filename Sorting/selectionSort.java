public class selectionSort {

    public static int[] sortArray(int[] arr) {
        int max, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            temp = arr[max];
            arr[max] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
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
