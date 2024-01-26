import java.util.*;

public class practical12 {
     public static void main(String[] args) {

          // check the given number is prime or not prime

          Scanner sc = new Scanner(System.in);
          System.out.print("Enter A Number :- ");
          int n = sc.nextInt();

          int count = 0;

          for(int i = 1 ; i <= n ; i++){
               if (n%i==0) {
                    count++;
               }
          }

          if (count == 2) {
               System.out.println("Prime");
          }
          else{
               System.out.println("Not Prime");
          }

          sc.close();
     }
}