public class ispalindrom {
    public static boolean palindrom(String str, int l, int r){
        // method 1
            // if(idx == str.length()) return "";
            // String sp = palindrom(str, idx + 1);
            // String ans = sp + str.charAt(idx);
            // return ans;

            //Method 2
            //Base Case
            if(l>=r) return true;
            //Sefl work

            return (str.charAt(l)==str.charAt(r) && palindrom(str, l+1, r-1));
             



    }
    public static void main(String[] args) {
        String str = "lemon";
        // String result = palindrom(str, 0, str.length()-1);
        System.out.println(palindrom(str, 0, str.length()-1));
        // if(result.equals(str)){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }
    }
}
