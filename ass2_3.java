class Car{
   String model;
   int year;
   Car(String model, int year){
    this.model=model;
    this.year=year;
   }
   public void display(){
    System.out.println("Model is: "+model);
    System.out.println("Year is: "+year);
   }
}
public class ass2_3 {
    public static void main(String[] args) {
        Car c= new Car("Hector", 2024);
        c.display();
    }
}
