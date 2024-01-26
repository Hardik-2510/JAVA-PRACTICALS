import java.util.*;

public class practical3{
     public static void main(String[] args){
          // a program to design basic calculator
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Number - 1 :- ");
          float a = sc.nextFloat();
          System.out.print("Enter Number - 2 :- ");
          float b = sc.nextFloat();
          System.out.println(a + " + " + b + " = " + (a+b));
          System.out.println(a + " - " + b + " = " + (a-b));
          System.out.println(a + " * " + b + " = " + (a*b));
          System.out.println(a + " / " + b + " = " + (a/b));
          sc.close();
     }
}