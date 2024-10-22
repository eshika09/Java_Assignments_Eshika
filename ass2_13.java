class Animal1 {

    public void eat() {
        System.out.println("This animal eats food.");
    }
}
class Mammal1 extends Animal1 {

    public void walk() {
        System.out.println("This mammal walks on land.");
    }
}
class Dog1 extends Mammal1 {
    
    public void bark() {
        System.out.println("The dog barks.");
    }
}
public class ass2_13 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();

        
        dog.eat();  
        dog.walk(); 
        dog.bark();
    }
}
