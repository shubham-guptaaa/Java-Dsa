class heap{
    int heap[];
    int size;
    int capacity;
    heap(int heap[]){
        this.heap = heap;
        size = heap.length;
        capacity = heap.length;
    }
    public void increaseKey(int idx, int val){
        if(idx<0 || idx>=size || heap[idx]>=val){
            System.out.println("Wrong Operation");
            return;
        }
        heap[idx] = val;
        while(idx>0 && heap[idx]>heap[(int)(Math.ceil(idx/2)-1)]){
            swap(idx, (int)(Math.ceil(idx/2)-1));
            idx = (int)(Math.ceil(idx/2)-1);        }
    }
    public void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public void decreaseKey(int idx, int val){
        if(idx<0 || idx>=size || heap[idx]<=val){
            System.out.println("Wrong Operation");
            return;
        }
        heap[idx] = val;
        heapifymax(idx);
    }
    public void increaseCapacity(){
        capacity = capacity*2;
        int[] newHeap = new int[capacity];
        for(int i = 0; i<size; i++){
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }
    public void insert(int val){
        if(size+1>=capacity){
            increaseCapacity();
        }
        size++;
        heap[size-1] = val;
        int idx = size-1;
        while(idx>0 && heap[idx]>heap[(int)(Math.ceil(idx/2.0)-1)]){
            swap(idx, (int)(Math.ceil(idx/2.0)-1));
            idx = (int)(Math.ceil(idx/2.0)-1);
        }
    }
    public int extractMin(){
        if(size==0){
            System.out.println("Heap is Empty");
            return -1;
        }
        int min = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapifymin(0);
        return min;
    }
    public int[] heapSort(){
        buildMaxTree();
        for(int i = size-1; i>0; i--){
            swap(0, i);
            size--;
            heapifymax(0);
        }
        size = heap.length; // reset size after sorting
        return heap;
    }
    public void heapifymax(int idx){
        int len = idx;
        int left = 2*len+1;
        int right = 2*len+2;
        if(left<size && heap[left]>heap[len]){
            len = left;
        }
        if(right<size && heap[right]>heap[len]){
            len = right;
        }
        if(len!=idx){
            swap(len, idx);
            heapifymax(len);
        }
    }
    public void heapifymin(int idx){
        int len = idx;
        int left = 2*len+1;
        int right = 2*len+2;
        if(left<size && heap[left]<heap[len]){
            len = left;
        }
        if(right<size && heap[right]<heap[len]){
            len = right;
        }
        if(len!=idx){
            swap(idx, len);
            heapifymin(len);
        }
    }
    public int pop(){

        if(size==0){
            System.out.println("Heap is Empty");
            return -1;
        }
        int max = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapifymax(0);
        return max;
    }
    public int minElement(){
        if(size==0){
            System.out.println("Heap is Empty");
            return -1;
        }
        int min = heap[size-1];
        size--;
        return min;
    }
    public void buildMaxTree(){
        //n/2 to n-1
        for(int i = size/2-1; i>=0; i--){
            heapifymax(i);
        }
    }
    public void buildMinTree(){
        for(int i = size/2-1; i>=0; i--){
            heapifymin(i);
        }
    }
    public void printHeap(){
        for(int i = 0; i<size; i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10,5,20,6,11};
        heap h = new heap(arr);
        // System.out.println("Max Heap");

        // h.buildMaxTree();
        // h.printHeap();
        // // System.out.println("Min Heap");
        // // h.buildMinTree();
        // // h.printHeap();
        // // System.out.println("Extract the max Element of the heap:- "+h.pop());
        // // System.out.println("Extract the min element of the heap:- "+h.minElement());
        // // System.out.println("Increase the key of the heap at index 2 to 30");
        // // h.increaseKey(2, 30);
        // // h.printHeap();
        // // h.decreaseKey(0, 4);
        // // h.printHeap();
        // System.out.print("Insert 50 in the heap:- ");
        // h.insert(50);
        // h.printHeap();
        h.printHeap();
        int[] result = h.heapSort();
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        
    }
}