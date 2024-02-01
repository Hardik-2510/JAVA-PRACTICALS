import java.util.*;
class practical15a {
	public static void main(String[] args) {
		
          // max min number from 1-D Array

          int a[]={1,423,6,46,34,23,13,53,4}; 
		
		Arrays.sort(a);

          for(int i = 0 ; i < a.length ; i++){
               System.out.print(a[i]);
          }
	
		System.out.println("min-"+a[0]+" max-"+a[a.length-1]);
	}
}
