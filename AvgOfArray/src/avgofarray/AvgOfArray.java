package avgofarray;
import java.util.Scanner;

public class AvgOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of int elements you want to store:  ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        
        for (int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        // accessing array elements using the for loop  
        int sum = 0;
        for (int i=0; i<n; i++)   
        {  
            sum += a[i]; 
        }  
        
        System.out.println("Avg of the array element: " + sum/n);
    }
    
}
