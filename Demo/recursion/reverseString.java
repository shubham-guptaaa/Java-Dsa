public class reverseString {
    public static String reverse(String str, String ans, int idx){
        //Base case
        // if(idx==str.length()) return "";
        // // recursive call
        // String sp = reverse(str, idx+1);

        // return sp+str.charAt(idx);
        if(idx<0) return ans;
        return reverse(str, ans+str.charAt(idx), idx-1);
        
    }
    public static void main(String[] args) {
        String str = "abcde";
        int idx = str.length();
        System.out.println(reverse(str, "",idx-1));
    }
}
