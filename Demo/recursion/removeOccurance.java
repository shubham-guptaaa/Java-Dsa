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

    // Method 2

    public static String remv(String str){
        // Base Case
        if(str.length()==0) return "";
        //small ans 
        String sa = remv(str.substring(1));
        // self work
        if(str.charAt(0)!='a'){
            return str.charAt(0)+sa;

        }
        else return sa;


    }

    public static void main(String[] args) {
        String str = "abacx";
        int idx = 0;
        System.out.println(remove(str, idx));
        System.out.println(remv(str));
    }
}
