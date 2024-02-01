import java.util.*;

public class practical10 {
     public static void main(String[] args){
          
     // write a programme to design basic calculator using switch case

          Scanner sc = new Scanner(System.in);
          System.out.println("1.Addition");
          System.out.println("2.Subtraction");
          System.out.println("3.Multiplication");
          System.out.println("4.Division");
          System.out.println("5.Square");
          System.out.println("6.Cube");
          System.out.print("Choose Operation :- ");
          int opt = sc.nextInt();

          switch (opt) {
               case 1:
                    System.out.print("Enter Number-1 :- ");
                    int a = sc.nextInt();
                    System.out.print("Enter Number-2 :- ");
                    int b = sc.nextInt();
                    System.out.print(a + " + " + b + " = " + (a+b));
                    break;
               
                    case 2:
                    System.out.print("Enter Number-1 :- ");
                    int x = sc.nextInt();
                    System.out.print("Enter Number-2 :- ");
                    int y = sc.nextInt();
                    System.out.print(x + " - " + y + " = " + (x-y));
                    break;

                    case 3:
                    System.out.print("Enter Number-1 :- ");
                    int c = sc.nextInt();
                    System.out.print("Enter Number-2 :- ");
                    int d = sc.nextInt();
                    System.out.print(c + " * " + d + " = " + (c*d));
                    break;

                    case 4:
                    System.out.print("Enter Number-1 :- ");
                    int e = sc.nextInt();
                    System.out.print("Enter Number-2 :- ");
                    int f = sc.nextInt();
                    System.out.print(e + " / " + f + " = " + (e/f));
                    break;

                    case 5:
                    System.out.print("Enter Number :- ");
                    int g = sc.nextInt();
                    System.out.print(g + " ^ 2 " + " = " + (g*g));
                    break;

                    case 6:
                    System.out.print("Enter Number :- ");
                    int h = sc.nextInt();
                    System.out.print(h + " ^ 3 " + " = " + (h*h*h));
                    break;
          
               default:
                    System.out.println("Invalid Option !");
                    break;
          }
          sc.close();
     }
}
