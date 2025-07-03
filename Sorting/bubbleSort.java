class Solution {
    public int[] sortArray(int[] arr) {

        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
class bubbleSort {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] sortedArr = solution.sortArray(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}