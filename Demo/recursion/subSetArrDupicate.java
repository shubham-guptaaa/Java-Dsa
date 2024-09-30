import java.util.*;
public class subSetArrDupicate {
    public static void main(String[] args) {
        int arr[] = {1,2,2};
        List<List<Integer>> ans = subSetRec(arr);
        for(List<Integer> list : ans){
            System.out.print(list);
        }
    }
    static List<List<Integer>> subSetRec(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;
        for(int i = 0; i<arr.length; i++){
            s = 0;
            if(i>0 && arr[i] == arr[i-1]){
                s = e+1;
            }
            else{
                e = outer.size()-1;
            }
            int n = outer.size();
            for(int j = s; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;


    }
    
}
