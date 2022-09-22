package lab4;

class Calculate {
    public int a,b;
    
    void show(String type, int result){
        System.out.println(type+"is: "+result);
    }
}

class Addition extends Calculate {
    
    public int calculate(int a, int b) {
        return a+b;
    }
}

class SubsTraction extends Calculate {
    
    public int calculate(int a, int b) {
        return a-b;
    }
}

class Multiplication extends Calculate {
    public int calculate(int a, int b) {
        return a*b;
    }
}

class Divison extends Calculate {
    public int calculate(int a, int b) {
        return a/b;
    }
}

public class InheritanceLabProb2 {

    public static void main(String[] args) {
        
        Addition add = new Addition();
        add.show("Addition", add.calculate(4,2));
        
        SubsTraction sub = new SubsTraction();
        sub.show("SubsTraction", sub.calculate(4,2));
        
        Multiplication mul = new Multiplication();
        mul.show("Multiplication", mul.calculate(4,2));
        
        Divison div = new Divison();
        div.show("Division  ", div.calculate(4,2));
    }
    
}
