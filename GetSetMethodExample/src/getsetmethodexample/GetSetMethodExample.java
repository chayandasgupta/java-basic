package getsetmethodexample;

class Person
{
    private String name;
    
    public String getName(){
        return name;
    }
    
    public void setName(String personName) {
        this.name = personName;
    }
}
public class GetSetMethodExample {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("chayan");
        System.out.println("Name is: "+p.getName());
    }
    
}
