import java.util.Scanner;

import javax.swing.Box;
abstract class ThreeDObject{
public abstract double wholesurfaceArea();
public abstract double volume();

}
class box extends ThreeDObject{
    double length, width, height;
    box(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;}
        public double wholesurfaceArea(){
            return 2*(length*width+width*height+height*length);
        }
        public double volume(){
            return length*width*height;
        }

    }
    class cube extends ThreeDObject{
        double side;
        cube(double side){
            this.side=side;
        }
        public double wholesurfaceArea(){
            return side*side*6;
        }
        public double volume(){
            return side*side*side;
        }
    }
    class cylinder extends ThreeDObject{
        double radius, height;
        cylinder(double radius, double height){
            this.radius=radius;
            this.height=height;
        }
        public double wholesurfaceArea(){
            return 2*3.14*radius*(radius+height);
        }
        public double volume(){
            return 2*3.14*radius*height;
        }
    }
    class cone extends ThreeDObject{
        double radius;
        double height;
        cone(double radius, double height){
            this.radius=radius;
            this.height=height;
        }
        public double wholesurfaceArea(){
            double l = Math.sqrt((height * height) + (radius * radius));
            return 3.14*radius*(radius+l);
        }
        public double volume(){
            return 3.14*radius*radius*height/3.0;
        }
    }

public class ass2_9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter length, width, and height of the box: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        box b = new box(length, width, height);
        System.out.println("Box Surface Area: " + b.wholesurfaceArea());
        System.out.println("Box Volume: " + b.volume());

        
        System.out.print("\nEnter side length of the cube: ");
        double side = sc.nextDouble();
        cube cub = new cube(side);
        System.out.println("Cube Surface Area: " + cub.wholesurfaceArea());
        System.out.println("Cube Volume: " + cub.volume());

        
        System.out.print("\nEnter radius and height of the cylinder: ");
        double radius = sc.nextDouble();
        double cylinderHeight = sc.nextDouble();
        cylinder c = new cylinder(radius, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + c.wholesurfaceArea());
        System.out.println("Cylinder Volume: " + c.volume());


        System.out.print("\nEnter radius and height of the cone: ");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        cone con = new cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + con.wholesurfaceArea());
        System.out.println("Cone Volume: " + con.volume());

 
    }
}
