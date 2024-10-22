class A{
    public static void statMethod(){
        System.out.println("Static method in A class");
    }
    public void instanceMeth(){
        System.out.println("Instance meth in A class");
    }
}
class B extends A{
    public static void statMethod(){
        System.out.println("Static meth of B class");
    }
    public void instanceMeth(){
        System.out.println("Instance meth of B class");
    }
}
public class ass2_8 {
    public static void main(String[] args) {
        A.statMethod();
        B.statMethod();
        A a = new B();
        a.statMethod();
        a.instanceMeth();

    }
}
