import java.util.Scanner;

public class practical8 {
    public static void main(String[] args) {

     // exam result analysis

        int s1 , s2 , s3 , s4 , s5 ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks (out of 30): ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        s5 = sc.nextInt();

        float avg = (s1 + s2 + s3 + s4 + s5) / 5 ;

        

        if(s1 < 30 && s2 < 30 && s3 < 30 && s4 < 30 && s5 < 30 ){
            if (avg >= 26){
                System.out.println("Congratulations ! You Have Passed With A Grades !");
            }
            else if(avg >= 21){
                System.out.println("Congratulations ! You Have Passed With B Grades !");
            }
            else if(avg >= 13){
                System.out.println("Congratulations ! You Have Passed With C Grades !");
            }    
            else if(avg >= 12){
                System.out.println("Congratulations ! You Have Passed With D Grades !");
            }
            else if(avg < 12){
            System.out.println("Alert! You are failed and you have to give makeup tests to clear the subject!");
        }
    }
    else{
        System.out.println("Sorry ! Enter Valid Marks Between 0 - 30");
    }
        sc.close();
    }
}
