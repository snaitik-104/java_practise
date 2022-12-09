package Tutorials;

import java.util.Scanner;

public class pythagoreanTriplet {

    public static boolean IsPythagorean(int a, int b , int c){
        int num1 = a*a;
        int num2 = b*b;
        int num3 = c*c;
        if((num1+num2)==num3){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args)
    {
      while (true)
      {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          System.out.println(IsPythagorean(a,b,c));
      }
    }
}
