package sumtwonumber;
import java.util.*; 

public class SumTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first double number:  ");
        double firstNumber = sc.nextFloat();
        
        System.out.println("Enter second double number:  ");
        double secondNumber = sc.nextFloat();
        
        double sum = firstNumber + secondNumber;
        
        System.out.println("Sum of two double number is:  " +  sum);
    }
    
}
