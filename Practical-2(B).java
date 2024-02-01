import java.util.*;

public class practical4{
     public static void main(String [] args){
          // a programm to calculate the volume of cube

          Scanner sc = new Scanner(System.in);
          System.out.print("Enter A Number :- ");
          float a = sc.nextFloat();
          float cube = a*a*a;
          System.out.println("The Cube of " + a + " = " + cube);
          sc.close();
     }
}
