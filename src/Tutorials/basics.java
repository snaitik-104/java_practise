package Tutorials;

public class basics {
    public static void main(String[] args) {

        // initialisation of variables
        int unique_ID= 012;
        int marks = 72;

        // printing the variables
        System.out.println(unique_ID);
        System.out.println(marks);

        //adding two different variables and adding them too other variables
        System.out.println("-------------------------------");
        int value1 = 10;
        int value2 = (5+3)+(10*2);
        int sum = value1 + value2;
        System.out.println(sum);

        //challenge initialise three variables and add them
        System.out.println("--------------------------------");
        int a = 13;
        int b = 26;
        int c = 39;
        int total = a+b+c;
        System.out.println(total);

        //print max and min values of integer
        System.out.println("-------------------------------------");
        int max_value = Integer.MAX_VALUE;
        int min_value = Integer.MIN_VALUE;

        System.out.println(max_value);
        System.out.println(min_value);
    }

}
