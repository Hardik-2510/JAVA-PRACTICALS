public class practical13a {
     public static void main(String[] args) {

          // even numbers * pattern

          for(int i = 0 ; i < 6 ; i++){
               for(int j = 0 ; j < i ; j++){
                    if (i%2 == 1) {
                         System.out.print("*");
                    }
               }
               System.out.println();
          }
     }
}
