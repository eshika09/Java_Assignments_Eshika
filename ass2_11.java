class Num {
    protected int number;

    
    public Num(int number) {
        this.number = number;
    }

    
    public void shownum() {
        System.out.println("The number is: " + number);
    }
}
class HexNum extends Num {
    
    public HexNum(int number) {
        super(number);  
    }


    @Override
    public void shownum() {
        
        super.shownum();  
        System.out.println("Hexadecimal value: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal value: " + Integer.toOctalString(number));
    }
}
public class ass2_11 {
    public static void main(String[] args) {
      Num  numObj = new Num(255);
        System.out.println("Displaying from Num class:");
        numObj.shownum();  
        
        
        HexNum hexObj = new HexNum(255);
        System.out.println("\nDisplaying from HexNum class:");
        hexObj.shownum(); 
    }
}
