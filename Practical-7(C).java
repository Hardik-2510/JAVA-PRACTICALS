import java.util.*;

public class practical17 {
     public static void main(String[] args){
          
          // addition of 3*3 matrices

          Scanner sc = new Scanner(System.in);

          int M1[][] = new int[3][3];
          int M2[][] = new int[3][3];

          
          System.out.println("Enter Matrix-1 :-"); 
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                    M1[i][j] = sc.nextInt();
               }
          }
          
          System.out.println("Enter Matrix-2 :-"); 
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                    M2[i][j] = sc.nextInt();
               }
          }

          System.out.println("Matrix-1 + Matrix-2 :");
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                    System.out.print(M1[i][j]  + M2[i][j] + " ");
               }
               System.out.print("\n");
          }
          sc.close();
     }     
}
