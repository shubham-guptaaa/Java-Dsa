import java.util.ArrayList;
import java.util.Collections;

public class fib {
    // private static int fibhelper(int n, ArrayList<Integer> dp){
    //     if(n==0 || n==1) return n;
    //     if(dp.get(n)!=-1){
    //         return dp.get(n);
    //     }
    //     int result = fibhelper(n-1, dp) + fibhelper(n-2, dp);
    //     dp.set(n, result);
    //     return result;

    // }
    // public static int fibonacci(int n){
    //     ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n + 1, -1));
    //     return fibhelper(n, dp);
    // }
    public static int fibonacci(int n){
    int prev1 = 1;
    int prev2 = 0;
    for(int i = 2; i<=n; i++){
        int curr = prev1+prev2;
        prev2 = prev1;
        prev1 = curr;
    }
    return prev1;
}
    public static void main(String[] args){
        System.out.println(fibonacci(8));
    }
}
