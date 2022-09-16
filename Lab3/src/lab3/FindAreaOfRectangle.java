package lab3;
import java.util.Scanner;

class Area
{   
    private float length;
    private float breadth;
    
    public void setDim(float length, float breadth)
    {
        this.length  = length;
        this.breadth = breadth;
    }
    public double getArea()
    {   
        return length * breadth;
    }
}

public class FindAreaOfRectangle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter rectangle length: ");
        float recLength = sc.nextFloat();
        
        System.out.println("Enter rectangle breadth: ");
        float recBreadth = sc.nextFloat();
        
        Area area = new Area();
        area.setDim(recLength, recBreadth);
        
        System.out.println("Area of rectangle is: "+area.getArea());
    }
    
}
