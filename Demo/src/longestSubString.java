import java.util.*;
public class longestSubString {
    public static int findLongestSubString(String str, int k){
        // Brute force approch
        // Map<Character , Integer> mpp = new HashMap<>();
        // int maxlen = 0;
        // int n = str.length();
        // for(int i = 0; i<n; i++){
        //     mpp.clear();
        //     for(int j = i; j<n; j++){
        //         mpp.put(str.charAt(j), mpp.getOrDefault(str.charAt(j), 0) + 1); 
        //         if(mpp.size()<=k){
        //             maxlen = Math.max(maxlen, j-i+1);
        //         }
        //         else{
        //             break;
        //         }

        //     }

        // }
        // return maxlen;


        
        // Better Approch
        // int maxlen = 0; int l = 0; int r = 0;
        // int n = str.length();
        // Map<Character , Integer> mpp = new HashMap<>();
        // while (r < n) {
        //     mpp.put(str.charAt(r), mpp.getOrDefault(str.charAt(r), 0) + 1); 
            
        //     while (mpp.size() > k) {
        //         mpp.put(str.charAt(l), mpp.get(str.charAt(l)) - 1);
        //         if (mpp.get(str.charAt(l)) == 0) {
        //             mpp.remove(str.charAt(l));
        //         }
        //         l++;
        //     }
            
        //     // Update the maxlen if the current window size is larger
        //     if(mpp.size()<=k){
        //     maxlen = Math.max(maxlen, r - l + 1);
        //     r++;
        //     }
        // }
        
        // return maxlen;

        // Optimal Approch

        int maxlen = 0; int l = 0; int r = 0;
        int n = str.length();
        Map<Character , Integer> mpp = new HashMap<>();
        while (r < n) {
            mpp.put(str.charAt(r), mpp.getOrDefault(str.charAt(r), 0) + 1); 
            
             if(mpp.size() > k) {
                mpp.put(str.charAt(l), mpp.get(str.charAt(l)) - 1);
                if (mpp.get(str.charAt(l)) == 0) {
                    mpp.remove(str.charAt(l));
                }
                l++;
            }
            
            // Update the maxlen if the current window size is larger
            if(mpp.size()<=k){
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
            }
        }
        
        return maxlen;
    }
    public static void main(String[] args) {
        String str = "aaabbccd";
        int k = 2;
        System.out.println(findLongestSubString(str, k));
    }
    
}
