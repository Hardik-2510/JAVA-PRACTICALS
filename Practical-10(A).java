import java.util.*;

public class Practical10A{

     public static void SumFirstnNumbers(int n){

          int sum = 0 ; 
          for(int i = 1 ; i <= n ; i++ ){
               sum = sum + i ;
          }
          System.out.println("Sum of First " + n + " Numbers = " + sum);
     }

  // Calculate The Sum Of First n Numbers Using Function

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter A Number : ");
          int n = sc.nextInt();

          SumFirstnNumbers(n);

          sc.close();
     }
}
