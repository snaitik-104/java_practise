package Tutorials;

import java.util.Scanner;

public class ifThenElse {
    public static void main(String[] args) {
     while (true){
         Scanner sc = new Scanner(System.in);
         byte student_score = sc.nextByte();

         if (student_score>=100){
             System.out.println("you got Grade S");
         }

         else if (student_score>=91 && student_score<=99){
             System.out.println("you got Grade 'A'");
         } else if (student_score>=81 && student_score<=90) {
             System.out.println("you got Grade 'B'");
         }
         else {
             System.out.println("you got failed");
         }

     }
    }

}
