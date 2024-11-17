// import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class permutArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = permut(arr);
        System.out.println(permutations);
    }
    /*static List<List<Integer>> permut(int arr[]){
        if(arr.length == 0){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            int n = arr[i];
            int[] first = Arrays.copyOfRange(arr, 0, i);
            int[] second = Arrays.copyOfRange(arr, i+1, arr.length);

            int ans[] = new int[first.length + second.length];
            System.arraycopy(first, 0, ans, 0, first.length);
            System.arraycopy(second, 0, ans, first.length, second.length);
            for(List<Integer> list : permut(ans)){
                List<Integer> newPermut = new ArrayList<>();
                newPermut.add(n);
                newPermut.addAll(list);
                result.add(newPermut);

            }
        }
        return result;

    }*/

    // Other Method

    static List<List<Integer>> permut(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        if(arr.length == 0){
            for(int num : arr){
                result.add(new ArrayList<>(num));
            } 
        }
        return result;

    }
    
}
