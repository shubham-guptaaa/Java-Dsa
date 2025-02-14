import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationPathII {
    public static void findUniqueCombination(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        //self work and recursive call
        for(int i = idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            findUniqueCombination(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findUniqueCombination(0, candidates, target, ans, ds);
        return ans;

    }
    public static void main(String[] args) {
        // candidates = [10,1,2,7,6,1,5], target = 8

        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(candidates);
        List<List<Integer>> ans = combinationSum2(candidates, target);
        System.out.println(ans);
        

    }
}
