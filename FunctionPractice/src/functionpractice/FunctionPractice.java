 
package functionpractice;
import java.util.Scanner;

public class FunctionPractice {

    
    public static void main(String[] args) {
        float num1, num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first no:");
        num1 = input.nextFloat();
        System.out.println("Enter second no:");
        num2 = input.nextFloat();
        
        float result;
        
        System.out.println("Result of Sum:");
        System.out.println(summetion(num1, num2));
        
        System.out.println("Result of difference:");
        System.out.println(difference(num1, num2));
        
        System.out.println("Result of mul:");
        System.out.println(mul(num1, num2));
        
        System.out.println("Result of div:");
        System.out.println(div(num1, num2));
    }
    
//    Summetion function
    public static float summetion(float num1, float num2)
    {
        return num1 + num2;
    }
    
//    Differench function
    public static float difference(float num1, float num2)
    {
        return num1 - num2;
    }
    
    //    Multiplication function
    public static float mul(float num1, float num2)
    {
        return num1 * num2;
    }
    
    //    Division function
    public static float div(float num1, float num2)
    {
        return num1 / num2;
    }
}
