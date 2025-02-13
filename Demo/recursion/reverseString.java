public class reverseString {
    public static String reverse(String str, int idx){
        //Base case
        if(idx==str.length()) return "";
        // recursive call
        String sp = reverse(str, idx+1);

        return sp+str.charAt(idx);
        
    }
    public static void main(String[] args) {
        String str = "abcde";
        int idx = 0;
        System.out.println(reverse(str, idx));
    }
}
