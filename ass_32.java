class Car{
    String model;
    int year;
    Car(String model, int year){
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println("Model is: "+model);
        System.out.println("Year is: "+year);
    }
}
public class ass_32 {
    public static void main(String[] args) {
        Car c= new Car("hector", 2023);
        c.display();
    }
}
