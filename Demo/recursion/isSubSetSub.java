public class isSubSetSub {
    public static boolean helper(int n, int k, int[] a, int idx){
        if(idx==a.length){
            return false; 
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
        // 4 13
        // 4 3 5 2
        // Sample Output 1 :
        // No
        int[] a ={4,3,5,2};
        int n = 4;
        int target = 13;
        System.out.println(isSubsetPresent(n, target, a));
    }
}
