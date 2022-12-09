package assignments;


public class practise_7 {
/*
* Varargs is a short name for variable arguments.
* In Java, an argument of a method can accept arbitrary number of values.
* This argument that can accept variable number of values is called varargs*/
    public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }
    public static void main( String[] args ) {
       practise_7 ex = new practise_7();

        int sum2 = ex.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = ex.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = ex.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}
