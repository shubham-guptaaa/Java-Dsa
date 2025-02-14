public class printSubSequence {
    public static void pSS(String str, String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        //self work
        char ch = str.charAt(0);
        String rem = str.substring(1);
        //recursive call
        pSS(rem, ans+ch); // if choose
        pSS(rem, ans); // if not choose
    }
    public static void main(String[] args) {
        pSS("abc", "");
    }
}
