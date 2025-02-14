import java.util.ArrayList;
import java.util.List;

public class combinationPath {
    public static void findCombination(int idx, int[] arr, int target,List<List<Integer>> ans, List<Integer> ds){
        //Base case
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //self work and recursive call
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            findCombination(idx, arr, target-arr[idx], ans, ds);
            ds.remove(ds.size() - 1); //backtrack for considering the same number as multiple time

        }
        findCombination(idx+1, arr, target, ans, ds);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombination(0, candidates, target, ans, ds);
        return ans;
    }
    public static void main(String[] args){
        // candidates = [2,3,6,7], target = 7
        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = combinationSum(arr, target);
        System.out.println(ans);
    }
}
