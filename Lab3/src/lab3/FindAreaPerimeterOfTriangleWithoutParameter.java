package lab3;

class Triangle
{   
    int side1, side2, side3;
    
    Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    
    public void Area()
    {
        float s     = ((side1+side2+side3) / 2);
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("Triangle area is: "+area);
    }
    
    public void Perimeter()
    {
        System.out.println("Triangle perimeter is: "+(side1+side2+side3));
    }
}

public class FindAreaPerimeterOfTriangleWithoutParameter {

    public static void main(String[] args) {
         Triangle triangle = new Triangle();
         triangle.Area();
         triangle.Perimeter();
    }
    
}
