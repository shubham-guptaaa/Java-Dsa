public class isPosssible {
    //Unique Binary Tree Requirements
    public static boolean possible(int a, int b){
        if(a==0 && b==0 || a==0 || b==0) return false;
        int p = 1;
        int i = 2;
        int post = 3;
        if(a==p && b==i || a==1 && b==p) return true;
        else if(a==p && b==post || a==post && b==p) return false;
        else if(a==i && b==post || a==post && b==i) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(possible(1, 2));
    }
}
