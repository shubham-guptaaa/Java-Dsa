public class isSubSetSub {
    public static boolean helper(int n, int k, int[] a, int idx){
        if(idx==a.length){
            return a[idx - 1] == k; // Check if the last element is the target
        }
        
        return helper(n, k-a[idx], a, idx+1) || helper(n, k, a, idx+1);
    }
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        if(helper(n, k, a, 0)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        // Sample Input 1 :
        // 5 14
        // 4 2 5 6 7
        // Sample Output 1 :
        // yes
        int[] a ={4,2,5,6,7};
        int n = 5;
        int target = 14;
        System.out.println(isSubsetPresent(n, target, a));
    }
}
