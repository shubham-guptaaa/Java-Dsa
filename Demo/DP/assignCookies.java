import java.util.*;
import java.util.Arrays;
class assignCookies
{
    public static int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0;
        int right = 0;
        while(left<n && right < m){
            if(g[left]<=s[right]){
                left++;
            }
            else{
                right++;
            }

        }
        return left;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in greed: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of element in cookies: ");
        int m = sc.nextInt();
        int[] g = new int[n];
        int[] s = new int[m];
        System.out.println("Enter the element in greed");
        for(int i = 0; i<n; i++){
            g[i] =sc.nextInt();
        } 
        System.out.println("Enter the element in cookies");
        for(int i =0; i<m; i++){
            s[i] = sc.nextInt();
        }
        System.out.println(findContentChildren(g, s));

        sc.close();
    }
}