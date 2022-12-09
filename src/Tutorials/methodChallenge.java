package Tutorials;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class methodChallenge
    {

    public static int grade(int student_score)
    {
        char grade;
        if (student_score>=100){
            grade = 'S';
        }
        else if (student_score>=91 && student_score<=99){
            grade = 'A';
        } else if (student_score>=81 && student_score<=90) {
            grade = 'B';
        }
        else {
            grade = 'F';
        }
        return grade;
    }
        public static void Details(String name , char student_marks)
    {
            System.out.println("Name of the student is: " + name + " he got grade " + student_marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name  = sc.next();
        System.out.println("enter your marks : ");
        int marks = sc.nextInt();
        char stu_grade = (char) grade(marks);
        Details(name,stu_grade);



    }
}
