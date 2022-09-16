package lab3;

class Triangle
{ 
    public void Area(int side1, int side2, int side3)
    {
        float s    = ((side1+side2+side3) / 2);
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println(area);
    }
    
    public void Perimeter(int side1, int side2, int side3)
    {
        System.out.println(side1+side2+side3);
    }
}

public class FindAreaPerimeterOfTriangleWithoutParameter {

    public static void main(String[] args) {
         int side1=3, side2=4, side3=5;
         Triangle triangle = new Triangle();
         triangle.Area(side1,side2,side3);
         triangle.Perimeter(side1,side2,side3);
    }
    
}
