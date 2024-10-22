class Person{
    String name;
    int age;
    Person(){
        name="Eshika";
        age=19;
        System.out.println("0 argument constructor");
    }
    Person(String name){
        this.name=name;
        age=19;//default
        System.out.println("1 argument constructor");
    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("2 argument constructor");
    }
    public void display(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}
public class ass2_4 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.display();
        Person p2=new Person("Ashish");
        p2.display();
        Person p3=new Person("Pranjal", 20);
        p3.display();

    }
}
