class Animall{
    public void sound(){
        System.out.println("Makes Sound");
    }
}
class Dogg extends Animall{
    public void sound(){
        System.out.println("Barks");
    }
}
class Catt extends Animall{
    public void sound(){
        System.out.println("Meows");
    }
}
public class ass2_7 {
    public static void main(String[] args) {
        Animall a= new Animall();
        a.sound();
        Dogg d= new Dogg();
        d.sound();
        Catt c= new Catt();
        c.sound();
    }
}
