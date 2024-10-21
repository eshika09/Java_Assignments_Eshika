class Car{String model;
    int year;
    Car(){
        model="hector";
        year=2015;
    }
   public void display(){
           System.out.println("Model: "+model);
           System.out.println("Year: "+year);
    }

}
public class ass_31 {
    public static void main(String[] args) {
        Car c= new Car();
        c.display();
    }
}
