class calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public String add(String a, String b){
        return a+b;
    }
}
public class ass2_6 {
    public static void main(String[] args) {
        calculator c= new calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.2, 3.4));
        System.out.println(c.add("Eshika", "Bhatia"));
    }
}
