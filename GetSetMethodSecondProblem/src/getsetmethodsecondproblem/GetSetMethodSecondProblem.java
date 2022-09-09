package getsetmethodsecondproblem;

class Student
{
    public String id;
    public String name;
    private Double cgpa;
    private String contact;
    
    public Double getCgpa()
    {
        return cgpa;
    }
    public String getContact()
    {
        return contact;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCGPA(Double cgpa) {
        this.cgpa = cgpa;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    
}

public class GetSetMethodSecondProblem {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId("20211203024");
        stu.setName("Chayan");
        stu.setCGPA(3.50);
        stu.setContact("01833255645");
        System.out.println("Student 1: ");
        System.out.println(stu.id);
        System.out.println(stu.name);
        System.out.println(stu.getCgpa());
        System.out.println(stu.getContact());
         
        System.out.println("===================");
        
        Student stu2 = new Student();
        stu2.setId("20211203024");
        stu2.setName("Kopil");
        stu2.setCGPA(3.40);
        stu2.setContact("01533255645");
        System.out.println("Student 2: ");
        System.out.println(stu2.id);
        System.out.println(stu2.name);
        System.out.println(stu2.getCgpa());
        System.out.println(stu2.getContact());
    }
    
}
