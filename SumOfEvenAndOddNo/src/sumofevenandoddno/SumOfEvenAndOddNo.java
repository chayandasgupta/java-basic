package sumofevenandoddno;
import java.util.Scanner;

public class SumOfEvenAndOddNo {
    
    public static float sumOfEvenNumber(int a[], int size) {
        int evenSum = 0;
        for(int i = 0; i < size; i++)
        {
            if(a[i] % 2 == 0)
            {
                evenSum += a[i]; 
            }
        }	
        return evenSum;
    }
    
    public static float sumOfOddNumber(int a[], int size) {
        int oddSum  = 0;
        
        for(int i = 0; i < size; i++)
        {
            if(a[i] % 2 != 0)
            {
                oddSum += a[i]; 
            }
        }	
        return oddSum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many elements you add in array");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter array elements");
        
        //push the element in array
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int arrLength = a.length;
        
        System.out.println("The sum of even number in this array =  " + sumOfEvenNumber(a, arrLength));
        System.out.println("The sum of odd number in this array  =  " + sumOfOddNumber(a, arrLength));
    }
    
}
