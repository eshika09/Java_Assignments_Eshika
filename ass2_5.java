class Animal{
    String name;
    String sound;
    Animal(String name, String sound){
        this.name=name;
        this.sound=sound;
        System.out.println("Parent class constructor");
    }
    void display(){
        System.out.println("Name is: "+name);
        System.out.println("Sound is: "+sound);
    }
}
class Dog extends Animal{
    String dogname;
    String dogsound;
    public Dog(String dogname, String dogsound){
       super(dogname, dogsound);
       System.out.println("Child class constructor");
    }
    public void display(){
        System.out.println("Name is: "+dogname);
        System.out.println("Sound is: "+dogsound);
    }

}
public class ass2_5 {
    public static void main(String[] args) {
        Dog dog= new Dog("Bunny","bhow bhow");
        dog.display();
    }
}
