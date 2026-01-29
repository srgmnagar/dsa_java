import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSetArr {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int arr[] = { 3, 5, 1, 3 };
        System.out.println(subsetsWDuplicates(arr));
    }

    static List<List<Integer>> subsetsWDuplicates(int[] nums) {
        // List<List<Integer>> list = new ArrayList<>();
        // sub(list,new ArrayList<Integer>(),nums,0);
        // return list;
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(nums);
        int start = 0, end = 0;
        outer.add(new ArrayList<>());
        for (int j = 0; j < nums.length; j++) {
            int n = outer.size();
            if (j > 0 && nums[j] == nums[j - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            for (int i = start; i < n; i++) {
                List<Integer> lst = new ArrayList<>(outer.get(i));
                lst.add(nums[j]);
                outer.add(lst);
            }
        }
        return outer;
    }

    static void subset(ArrayList<Integer> current, int[] arr, int index) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        subset(current, arr, index + 1);
        current.remove(current.size() - 1);
        subset(current, arr, index + 1);
    }
}
