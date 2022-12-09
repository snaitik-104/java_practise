package Tutorials;

public class functions {
    public static void MyDetails(String name,int age, double height){
        String n = name;
        int a = age;
        double h = height;
        System.out.println("my name is " + name);
        System.out.println("my age is " + age + " & height is " + height + "cm");
    }
// this is the hard coded function
    public static void defMessage(){
        String n = "Naitik Sharma";
        int a = 22;
        double h = 180;
        System.out.println("This is default Message");
        System.out.println("my name is " + n);
        System.out.println("my age is " + a + " & height is " + h + "cm");

    }

//    public static void rectangle(double length , double breadth){
//        double area = length + breadth;
//        double perimeter = 2*(length + breadth);
//
//        System.out.println("area is "+area);
//        System.out.println("perimeter is "+perimeter);
//
//    }

    public static double Areaofrectangle(double length , double breadth)
    {
        double area;
        return area = length + breadth;
    }
}
