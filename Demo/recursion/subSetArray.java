import java.util.*;
public class subSetArray {
    public static void main(String[] args) {
       int arr[] = {1,2,3};
       List<List<Integer>> ans = subSet(arr);
       for(List<Integer> list : ans){
        System.out.print(list);
       } 
    }
    static List<List<Integer>> subSet(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        // empty list
        outer.add(new ArrayList<>());
        for(int nums : arr){
            int n = outer.size();
            for(int i = 0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);
            }
        }
        return outer;
    }
}
