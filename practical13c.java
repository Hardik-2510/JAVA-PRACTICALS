class practical13c{
     public static void main(String[] args){

          // inverted alphabet pyramid

         char n = 'A';
         int a = 5;
         for(int i = 1 ; i <= a ;i++){
             for(int j = 1 ; j < a-i+1 ; j++){
                 System.out.print(n);
               }
               n++;
               System.out.println();
         }
     }
 }