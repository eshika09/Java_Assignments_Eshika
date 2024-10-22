class Car{
    String model;
    int year;
    Car(){
        model="Hector";
        year=2022;
    }
    void display(){
        System.out.println("Model is: "+model);
        System.out.println("Year is: "+year);
    }
}
public class ass2_2 {
    public static void main(String[] args) {
        Car c= new Car();
        c.display();
    }
}
