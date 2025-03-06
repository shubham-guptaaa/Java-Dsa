import java.util.PriorityQueue;

class NewStudent implements Comparable<NewStudent>{
    String name;
    int marks;
    NewStudent(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString(){
        return "Student name: "+ this.name + ", marks: " + this.marks;
    }
    @Override
    public int compareTo(NewStudent that){
        // return this.marks - that.marks; //assendig order
        return that.marks-this.marks; //desending order
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof NewStudent){
            NewStudent that = (NewStudent) obj;
            boolean isSame = (this.name.compareTo(that.name)==0);
            if(this.marks==that.marks && isSame){
                return true;
            }
        }
        return false;
    }
}
public class priorityQueue {

    public static void main(String[] args) {
        PriorityQueue<NewStudent> pq = new PriorityQueue<>();
        pq.offer(new NewStudent("Shubham", 100));
        pq.offer(new NewStudent("Ansh", 130));
        pq.offer(new NewStudent("Aadya", 200));
        pq.offer(new NewStudent("Shan", 90));
        System.out.println(pq.poll());
        System.out.println(pq.contains(new NewStudent("Ansh", 120)));
        
    }
}
