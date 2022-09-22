package lab4;

class User {
    public String name, userName;
    private String password;
    public int userType;
    
    public User(String name, String userName, String password, int userType) {
        this.name     = name;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }
    public void login() {
        System.out.println(userName+ "now logged in");
    } 
    
    public void logout() {
        System.out.println(userName+ "now logged out");
    }
}

class Student extends User {
    
    public int id, intake;
    public String dept;
    
    public Student(String name, String userName, String password, int userType, int id, int intake, String dept) {
        
        super(name, userName, password, userType);
        this.id = id;
        this.intake = intake;
        this.dept = dept;
    }
    
    public void courseReg() {
        System.out.println("========= Welcome to student panel =========\n"+"Student id: "+this.id+"\nName: "+this.name+"\nDepartment: "+this.dept+"\n");
    }
}

class Faculty extends User {
    
    public String shortCode, dept;
    public int roomNo;
    
    public Faculty(String name, String userName, String password, int userType, String shortCode, String dept, int roomNo) {
        
        super(name, userName, password, userType);
        this.shortCode = shortCode;
        this.dept      = dept;
        this.roomNo    = roomNo;
        
    }
    public void supervise() {
        System.out.println("========= Welcome to faculty panel =========\n"+"Yout faculty code: "+this.shortCode+"\nRoom No: "+this.roomNo+"\n");
    }
}

class Admin extends User {
    public int roomNo;
    
    public Admin(String name, String userName, String password, int userType, int roomNo) {
        
        super(name, userName, password, userType);
        this.roomNo = roomNo;
        
    }
   
    public void add() {
        System.out.println("========= Welcome to admin panel =========\n"+"Name is: "+this.name);
    }
}


public class authsytemwithinheritance {

    public static void main(String[] args) {
        Student student = new Student("Chayan", "chayan02", "123456", 1, 2021, 37, "CSE");
        student.courseReg();
        Faculty faculty = new Faculty("Ms.Sumi", "sumi29", "123456", 2, "su-20", "CSE", 302);
        faculty.supervise();
        Admin admin = new Admin("Vc", "chayan02", "123456", 3, 202);
        admin.add();
    }
    
}
