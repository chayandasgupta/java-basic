package lab3;

class Rectangle
{   
    private int length, breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public float Area()
    {
        return length*breadth;
    }
}

public class FindAreaOfTwoRectangles {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,8);
        System.out.println("Area of first rectangle: "+rectangle1.Area());
        System.out.println("Area of second rectangle: "+rectangle2.Area());
    }
    
}
