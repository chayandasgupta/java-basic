package lab3;

class Triangles
{   
    private int side1, side2, side3;
    Triangles(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double showArea()
    {
        float s    = ((side1+side2+side3) / 2);
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
    
    public int showPerimeter()
    {
        return side1+side2+side3;
    }
}

public class FindAreaPerimeterOfTriangleWithConstructorParam {

    public static void main(String[] args) {
        Triangles triangle = new Triangles(3,4,5);
        System.out.println("Area of triangle is: "+triangle.showArea());
        System.out.println("Perimeter of triangle is: "+triangle.showPerimeter());      
    }
    
}
