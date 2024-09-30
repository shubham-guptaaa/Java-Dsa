public class permutation {
    public static void main(String[] args){
    numberOfPer("", "abc");
    }
    static void numberOfPer(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        for(int i=0; i<str.length(); i++){
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            numberOfPer(first+ch+second, str.substring(1));
        }
    }
    
}
