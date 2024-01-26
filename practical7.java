import java.util.Scanner;

public class practical7 {
     public static void main(String[] args) {
          // check given number is positive or negative

          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a Number :- ");
          int a = sc.nextInt();
          
          if(a > 0)
          {
               System.out.println(a + " is Positive Number .");
          }
          else if(a < 0)
          {
               System.out.println(a + " is Negative Number .");
          }
          else
          {
               System.out.println(a + " is Nuteral Number (Zero) .");
          }
          sc.close();
     }
}
