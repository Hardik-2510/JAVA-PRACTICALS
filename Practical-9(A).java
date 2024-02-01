import java.util.*;

public class practical21 {
     public static void main(String[] args) {
          // accept string and count the vowels in string
          
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter String :- ");
          String str = sc.nextLine();
          
          int count = 0;
          
          for(int i = 0 ; i <= str.length() - 1 ; i++){
               if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    count = count + 1;
               }
          }
          System.out.println(count + " vowels in the string.");
          sc.close();
     }     
}
