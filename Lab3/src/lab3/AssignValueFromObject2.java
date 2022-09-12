package lab3;

class Students
{
    public String name, roll_no;
    private String address, phone_no;
    
    Students(String name, String roll_no, String address, String phone_no) {
        this.name     = name;
        this.roll_no  = roll_no;
        this.address  = address;
        this.phone_no = phone_no;
    }
    
    public String show()
    {
         return "Student name is "+name+". Roll no is "+roll_no+". He living in "+address+". His phone no is "+phone_no;
    }
}
public class AssignValueFromObject2 {
    
    public static void main(String[] args) {
        Students studentOne = new Students("Sam", "20", "Mirpur", "01833255634");
        Students studentTwo = new Students("John", "20", "Mirpur", "01833255634");
        
        System.out.println(studentOne.show());
        System.out.println(studentTwo.show());
    }
    
}
