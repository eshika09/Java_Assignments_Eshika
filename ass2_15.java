class Student{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.name=name;
        this.rollno=rollno;
    }
    public void display(){
        System.out.println("Roll no. is: "+rollno);
        System.out.println("Name is: "+name);
    }
    public void updatename(String name){
        this.name=name;
    }
}
public class ass2_15 {
    public static void main(String[] args) {
        Student st= new Student(20, "Ashish");
        st.display();
        st.updatename("Eshika");
        st.display();
    }
}
