package lab3;

class Student 
{
    public String name;
    public int roll_no;
    
    Student(String name, int roll)
    {
        this.name    = name;
        this.roll_no = roll;
    }
}

public class AssignValueFromObject {

    public static void main(String[] args) {
        Student student = new Student("John", 2);   
        System.out.println("Student name is "+student.name+" and "+"roll is "+student.roll_no);
    }
    
}
