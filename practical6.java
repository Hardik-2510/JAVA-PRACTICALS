import  java.util.*;

public class practical6 {
     public static void main(String[] args){
          // check the given number is odd or even
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter A Number :- ");
          int a = sc.nextInt();

          if (a%2 == 0) {
               System.out.print(a + " is even number .");
          }
          else{
          System.out.print(a + " is odd number .");
          }
          sc.close();
     }
}