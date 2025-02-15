class mazeProblem{
    public static int countNoWay(int r, int c){
        if(r==1||c==1){
            return 1;

        }
        int left = countNoWay(r-1, c);
        int right = countNoWay(r, c-1);
        return left+right;
    }
    public static void main(String[] args) {
        System.out.println(countNoWay(3, 3));
    }
}