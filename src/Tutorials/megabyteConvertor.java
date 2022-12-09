package Tutorials;

import java.util.Scanner;

public class megabyteConvertor {
    public static double Convertor(double kilobytes)
    {
        return kilobytes/1024;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kb = sc.nextDouble();

        System.out.println("your data in kb is " + kb + "kb");
        System.out.println("kb to mb is " + Convertor(kb));
    }
//    public static void printMegaBytes(int kiloBytes){
//
//        if (kiloBytes < 0){
//            System.out.println("Invalid Value");
//        } else {
//            int megabytes = (kiloBytes/1024);
//            int kiloRemainder = kiloBytes%1024;
//            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+kiloRemainder+" KB");
//        }
//
//    }
//
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int kiloBytes=sc.nextInt();
//        printMegaBytes(kiloBytes);
//    }

}
