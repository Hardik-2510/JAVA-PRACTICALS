public class practical11 {
     public static void main(String[] args) {
          // find the sum of all integer grater than 100 & less than 200 and are divisible by 5
          int sum = 0 ;
          for(int i = 101 ; i < 200 ; i++){
               if (i%5 == 0) {
                    sum = sum + i ;
               }
          }
          System.out.println("the sum of all integer grater than 100 & less than 200 and are divisible by 5 = " + sum);
     }
}
