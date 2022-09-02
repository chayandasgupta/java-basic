//Take a string as input and check whether its length is odd or even using a method.
package findstringlengthoddoreven;
import java.util.Scanner;

public class FindStringLengthOddOrEven {
    
    public static void checkEvenOrOdd(String str) {
        int strLength = str.length();
        
        //check string length is even or odd
        if(strLength % 2 == 0) {
            System.out.println("This is even");
        } else {
            System.out.println("This is odd");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type your text or string:");
        String str = input.nextLine();
        
        checkEvenOrOdd(str);
        
    }
}
