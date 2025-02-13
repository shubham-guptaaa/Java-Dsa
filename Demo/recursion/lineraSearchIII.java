import java.util.ArrayList;
import java.util.List;

public class lineraSearchIII {
    public static List<Integer> searchIdx(int[] arr, int target, int idx, List<Integer> ans) {
        if (idx == arr.length) {
            if (ans.isEmpty()) {
                ans.add(-1);
            }
            return ans;
        }
        if (arr[idx] == target) {
            ans.add(idx);
        }
        return searchIdx(arr, target, idx + 1, ans);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2, 5 };
        int target = 2;
        List<Integer> result = searchIdx(arr, target, 0, new ArrayList<>());
        System.out.println(result);
    }
}
