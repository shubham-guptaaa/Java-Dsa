import java.util.ArrayList;
import java.util.List;

public class combinationPathIII {
    public static void genCombination(int idx, int k, int target, List<List<Integer>> ans, List<Integer> ds){
        if (target == 0 && ds.size() == k) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (target < 0 || ds.size() > k) {
            return;
        }
        //self work and recursive call
        for(int i = idx; i<=9; i++){
            ds.add(i);
            genCombination(i+1, k, target-i, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum2(int k, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        genCombination(1, k, target, ans, ds);
        return ans;

    }
    public static void main(String[] args) {
        int k = 3;
        int target = 7;
        List<List<Integer>> ans = combinationSum2(k, target);
        System.out.println(ans);
    }
}
