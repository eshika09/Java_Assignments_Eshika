public class ass1_25 {
    static class Stacks{
        int[] arr;
        int capacity;
        int top;
        Stacks(int c){
            this.capacity=c;
            arr= new int[c];
            this.top=-1;
        }
        void push(int data){
            if(this.top==this.capacity){
                System.out.println(" it is Overflow");
                return;
            }this.top++;
            this.arr[this.top]=data;
        }
        void pop(){
            if(this.top==-1){
                System.out.println("It is underflow");
                return;
            }this.top--;
        }
        int gettop(){
            if(this.top==-1){
                System.out.println("It is underflow");
                return -1;
            }return this.arr[this.top];
        }
        boolean isEmpty(){
            return this.top==-1;
        }
        int size(){
            return this.top+1;
        }
        boolean isFull(){
            return this.top==this.capacity-1;
        }
    };
    public static void main(String[] args) {
        Stacks st= new Stacks(8);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.gettop());

        st.push(4);
        st.push(5);
        System.out.println(st.gettop());
        st.push(8);

    }
}
