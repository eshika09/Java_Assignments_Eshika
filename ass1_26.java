import java.util.Vector;
public class ass1_26 {
    static class Queue{
        int front;
        int back;
        Vector<Integer>v;
        Queue(){
            this.front=-1;
            this.back=-1;
        }
        void enqueue(int data){
            this.v.add(data);
            this.back++;
            if(this.back==0){
                this.front=0;
            }
        }
        void dequeue(){
            if(this.front==this.back){
                this.front=-1;
                this.back=-1;
                this.v.clear();
            }else{
                this.front++;
            }
        }
        int getfront(){
            if(this.front==-1){
                return -1;
            }return this.v.get(this.front);
        }
        boolean isEmpty(){
            return this.front==-1;
        }

    }
    public static void main(String[] args) {
        Queue qu=new Queue();
        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        qu.enqueue(400);
        qu.enqueue(500);
        while(!qu.isEmpty()){
            System.out.println(qu.getfront());
            qu.dequeue();
        }
    }
}
