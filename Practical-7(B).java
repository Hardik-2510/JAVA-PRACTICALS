import java.util.*;

public class practical16 {
     public static void main(String[] args) {

          // sort an integer array in ascending order 
          
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Array :- ");
        int size = sc.nextInt();
        
        int number[] = new int[size];


        System.out.print("Enter the elements of array :- ");
        for(int i = 0 ;i < size ;i++){
             number[i] = sc.nextInt();
        }
        System.out.println("Before Asceding :");
        for(int i = 0 ;i < size ;i++){
          System.out.print(number[i] + " ");
     }

     Arrays.sort(number);

     System.out.println("\nAfter Asceding :");
        for(int i = 0 ;i < size ;i++){
          System.out.print(number[i] + " ");
     }

        sc.close();
     }     
}
