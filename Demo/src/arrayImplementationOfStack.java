

public class arrayImplementationOfStack {
    public static class Stack{
        int[] arr = new int[4];
        private int idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx == 0){
                return -1;

            }
            return arr[idx-1];
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            if(idx == 0){
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        int size(){
            return idx;
        }
        void display(){
            for(int i = 0; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(44);
        st.push(3);
        st.display(); //4 44 3
        System.out.println(st.size()); // 3
        st.pop();
        st.display(); //4 44
        st.push(1);
        st.push(9);
        st.push(0);
        st.display();
        System.out.println(st.capacity());
    }
    
}
