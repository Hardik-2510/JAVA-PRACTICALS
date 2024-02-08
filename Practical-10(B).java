import java.util.*;

public class Practical10B{

     public static void SumFirstnNumbers(int n){

          int fact = 1 ; 
          for(int i = 1 ; i <= n ; i++ ){
               fact = fact * i ;
          }
          System.out.println("Factorial of  " + n + " = " + fact);
     }

     public static void main(String[] args) {

      // Find The Factorial of First N Numbers
       
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter A Number : ");
          int n = sc.nextInt();

          SumFirstnNumbers(n);

          sc.close();
     }
}
