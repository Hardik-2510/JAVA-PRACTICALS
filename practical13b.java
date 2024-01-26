public class practical13b{
     public static void main(String[] args){

          // even numbers pyramid

         int n = 3;
         int number = 1; 
         for(int i = 1 ; i <= n ;i++){
             for(int j = 1 ; j <=i ; j++){
                 System.out.print(number + " ");
                 number = number + 2;
             }
                 System.out.println();
         }
     }
 }