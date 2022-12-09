package Tutorials;

import java.util.Scanner;

public class methodOverloadingChallenge {

    public static int area(int length){
        return length* length ;
    }

    public static int area(int length, int breadth){
        return length * breadth ;
    }

    public static double area(int breadth , double height){
        return ((breadth*height)/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        double h = sc.nextDouble();

        double sq_area = area(l);
        double rect_area = area(l,b);
        double tri_area = area(b,h);

        System.out.println("square area is " + sq_area);
        System.out.println("rect area is " + rect_area);
        System.out.println("tri area is " + tri_area);

    }
}
