import java.util.*;

public class practical15b{
    public static void main(String[] args){

     // search an element
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Array :- ");
        int size = sc.nextInt();
        
        int number[] = new int[size];


        System.out.print("Enter the elements of array :- ");
        for(int i = 0 ;i < size ;i++){
             number[i] = sc.nextInt();
        }
        
        System.out.print("Enter a number find From array :- ");
        int x = sc.nextInt();
        
        for(int i = 0 ; i < number.length ; i++){
            if(number[i] == x){
                System.out.println(x + " found at index " + (i+1));
            }
        }
        sc.close();
    }
}
