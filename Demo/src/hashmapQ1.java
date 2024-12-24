import java.util.*;
public class hashmapQ1 {
    public static void countOccu(int[] arr){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maxFre = 0;
        int anskey = -1;
        for(int i = 0; i<arr.length; i++){
           if(!mpp.containsKey(i)){
            mpp.put(i,1);
           }
           else{
            mpp.put(i, mpp.get(i)+1);
           }
        }
        System.out.println(mpp.entrySet());
        for(var e : mpp.entrySet()){
            if(e.getValue() > maxFre){
                maxFre = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.println(anskey); 

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6,7,8,9,9};
        countOccu(arr);
    }
}
