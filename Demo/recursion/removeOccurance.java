public class removeOccurance {
    public static String remove(String str, int idx){
        int n = str.length();
        //Base Case
        if(idx==n) return "";
        // Recursive Call
        String sp = remove(str, idx+1);
        // Self Work
        if (str.charAt(idx)!='a') {
            return str.charAt(idx)+sp;
        }
        else return sp;
    }
    public static void main(String[] args) {
        String str = "abacx";
        int idx = 0;
        System.out.println(remove(str, idx));
    }
}
