//Find the maximum number from an array.
//You have to use a function like:
//public static int Maximum(parameter array)
package findmaximumnumber;
import java.util.Scanner;

public class FindMaximumNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter loop length");
        int n = input.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter array elements");
        
        for(int i=0; i<n; i++) {
            a[i] = input.nextInt();
        }
     
        System.out.println("Maximum is:  " +  maxNumber(a));
    }
    
    public static int maxNumber(int a[]) {
        int max = a[0];
        for(int i = 0; i<a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        
        return max;
    }
    
}
