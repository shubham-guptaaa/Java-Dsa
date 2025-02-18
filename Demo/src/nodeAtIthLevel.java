class nodeAtIthLevel{
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static int countNodes(int i){
        return (int) Math.pow(2,i-1);

    }
    public static void main(String[] args) {
        int i = 9;
        System.out.println(countNodes(i));
    }
}