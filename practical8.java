import java.util.Scanner;

public class practical8 {
    public static void main(String[] args) {

     // exam result analysis

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks (out of 30): ");
        int marks = sc.nextInt();

        if (marks >= 12) {
            char grade;
            if (marks >= 26) {
                grade = 'A';
            } else if (marks >= 21) {
                grade = 'B';
            } else if (marks >= 13) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("Congratulations!! You are passed with grade " + grade + "!");
        } else {
            System.out.println("Alert! You are failed and you have to give makeup tests to clear the subject!");
        }
        sc.close();
    }
}
