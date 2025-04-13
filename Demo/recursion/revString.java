class revString{
    private static String helper(String str, String ans, int idx){
        if(idx<0) return ans;
        return helper(str, ans+str.charAt(idx), idx-1);
    }
    public static String rev(String str){
        if(str.length()==0) return "";
        String ans = "";
        return helper(str, ans, str.length()-1);

    }
    public static void main(String[] args){
        System.out.println(rev("Hello"));
    }
}