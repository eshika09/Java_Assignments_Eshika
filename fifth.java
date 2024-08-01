import java.util.Scanner;

public class fifth {
//constructor for public class fifth
public fifth(){
    int c=15;//local variable within the constructor
    int d=10;
    d=d+c;
    System.out.println(c);//this will print 15
}
public static void main(String[] args){
    int c=0;//local variable within the main method
    System.out.println(c);//this will print 0

    //creating an instance to call the constructor
    fifth obj=new fifth();

}    
}
