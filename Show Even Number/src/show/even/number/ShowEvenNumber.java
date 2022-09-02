package show.even.number;
import java.util.Scanner;

public class ShowEvenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integer element:  ");
        
        int n = sc.nextInt();
        
        System.out.println("List all even or odd number:");
        
        for(int i=1; i <= n; i++) {
            if(i%2 == 0) {
                System.out.println( i + "\tis even number");
            } else {
                if (i != 1) {
                   System.out.println("--------------------------"); 
                }
                
                System.out.println(i + "\t is odd number");
            }
        }
    }
    
}
