import java.util.*;

public class practical5 {
     public static void main(String[] args) {

          // swap two numbers using third variable

          Scanner sc = new Scanner(System.in);

          System.out.print("Enter A Number - 1 :- ");
          int a = sc.nextInt();
          System.out.print("Enter A Number - 2 :- ");
          int b = sc.nextInt();
          
          System.out.println("Before Swapping , \n Number-1 = " + a + " , Number-2 = " + b);

          int temp = a ;
          a = b ;
          b = temp;

          System.out.println("After Swapping , \n Number-1 = " + a + " , Number-2 = " + b);

          sc.close();
     }
}
