import java.util.*;

public class practical2{
     public static void main(String[] args){

          // program that reads variables with different data types and display their value

          Scanner sc = new Scanner(System.in);
          System.out.print("Enter String :- ");
          String a = sc.nextLine();
          System.out.print("Enter Int :- ");
          int b = sc.nextInt();
          System.out.print("Enter Float :- ");
          float c = sc.nextFloat();
          System.out.print("Enter Character :- ");
          char d = sc.next().charAt(0);
          System.out.print("Enter Double :- ");
          double e = sc.nextDouble();
          System.out.println("\nYou Have Entered......\n");
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
          System.out.println(d);
          System.out.println(e);
          sc.close();
     }
}
