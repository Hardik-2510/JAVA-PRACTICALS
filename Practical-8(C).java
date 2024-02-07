public class practical22 {
     public static void main(String[] args) {
          
          // remove duplicate character

          String str = "Programming Language";
          
          char[] arr = str.toCharArray();
          StringBuilder sb = new StringBuilder();
          for(int i = 0 ; i < arr.length ; i++){
               boolean repeated = false ;
               for(int j = i + 1 ; j < arr.length ; j++ ){
                    if(arr[i] == arr[j]){
                         repeated = true ;
                    }
               }
               if (!repeated){
                    sb.append(arr[i]);
               }
          }
          System.out.println(sb);
     }
}
