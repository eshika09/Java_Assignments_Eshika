import java.util.Scanner;
public class second {
    public  static void main(String[] args){
     //Primitive data types
     byte byteVar=100;
     short shortVar=10000;
     int intVar=56;
     long longVar=100000L;
     float floatVar=53.6f;
     double doubleVar=20.56788;
     char charVar='*';
     boolean boolVar=true;

     //non primitive data types
     String stringVar="Hello";
     int [] intArray={1, 2, 3, 4, 5};
     
     //printing values
     System.out.println("byte: " +byteVar);
     System.out.println("short: " +shortVar);
     System.out.println("int: " +intVar);
     System.out.println("long: " +longVar);
     System.out.println("float: " +floatVar);
     System.out.println("double: " +doubleVar);
     System.out.println("char: " +charVar);
     System.out.println("bool: " +boolVar);

     System.out.println("string: " +stringVar);
     System.out.println("Array: ");
     for(int i: intArray){
        System.out.print(i+" ");
     }

    }
}
