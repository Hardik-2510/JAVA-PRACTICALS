import java.util.*;

public class practical9 {
     public static void main(String[] args) {
          // find largest number among 3 numbers 
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter Number-1 :- ");
          int a = sc.nextInt();
          System.out.print("Enter Number-2 :- ");
          int b = sc.nextInt();
          System.out.print("Enter Number-3 :- ");
          int c = sc.nextInt();

          if (a > b && a > c) {
               System.out.print(a + " is Largest Number.");
          }
          else if (b > a && b > c) {
               System.out.print(b + " is Largest Number.");
          }
          else{
               System.out.print(c + " is Largest Number.");
          }
          sc.close();
     }
}
