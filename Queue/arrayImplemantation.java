package Queue;

public class arrayImplemantation {
    public static class arrayQueue{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Maximum Capcity of Array");
            }
            if(f==-1) {
            f=r=0;
            arr[0] = val;
        }
            else{
                arr[++r] = val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue in empty");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }
        public int Peek(){
            int x = arr[f];
            return x;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");

            }
            else{
                for(int i = f; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        arrayQueue q = new arrayQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.Peek());
    }
    
}
