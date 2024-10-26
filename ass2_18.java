interface InterfaceOne {
    void methodOne();
    void methodTwo();
}
interface InterfaceTwo {
    void methodThree();
    void methodFour();
}
interface InterfaceThree {
    void methodFive();
    void methodSix();
}
interface CombinedInterface extends InterfaceOne, InterfaceTwo, InterfaceThree {
    void methodSeven();
}
class ConcreteClass implements CombinedInterface {
    @Override
    public void methodOne() {
        System.out.println("Method One from Interface One");
    }

    @Override
    public void methodTwo() {
        System.out.println("Method Two from Interface One");
    }

    @Override
    public void methodThree() {
        System.out.println("Method Three from Interface Two");
    }

    @Override
    public void methodFour() {
        System.out.println("Method Four from Interface Two");
    }

    @Override
    public void methodFive() {
        System.out.println("Method Five from Interface Three");
    }

    @Override
    public void methodSix() {
        System.out.println("Method Six from Interface Three");
    }

    @Override
    public void methodSeven() {
        System.out.println("Method Seven from Combined Interface");
    }
}
class InterfaceDemo {
    public void demoMethodOne(InterfaceOne obj) {
        obj.methodOne();
        obj.methodTwo();
    }

    public void demoMethodTwo(InterfaceTwo obj) {
        obj.methodThree();
        obj.methodFour();
    }

    public void demoMethodThree(InterfaceThree obj) {
        obj.methodFive();
        obj.methodSix();
    }

    public void demoMethodFour(CombinedInterface obj) {
        obj.methodSeven();
    }
}

public class ass2_18 {
    public static void main(String[] args) {
        ConcreteClass concreteObj = new ConcreteClass();
        InterfaceDemo demo = new InterfaceDemo();
        demo.demoMethodOne(concreteObj);   
        demo.demoMethodTwo(concreteObj);   
        demo.demoMethodThree(concreteObj); 
        demo.demoMethodFour(concreteObj);  
    }
}
