class Counter {
    private static int instanceCount = 0;

    
    public Counter() {
        instanceCount++;
    }

    
    public static int getInstanceCount() {
        return instanceCount;
    }
}
public class ass2_16 {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        
        System.out.println("Total instances created: " + Counter.getInstanceCount());
    }
}
