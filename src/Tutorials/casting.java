package Tutorials;

public class casting {
    public static void main(String[] args) {

        byte max_value = Byte.MAX_VALUE;

        byte value1 = max_value;
        System.out.println(value1);

        //here Tutorials.casting is performed
        byte value2 = (byte) (max_value/2);
        System.out.println(value2);

        //new challenge

        int val1 = Integer.MAX_VALUE;
        short val2 = Short.MAX_VALUE;
        Byte val3 = Byte.MAX_VALUE;

        long finalvalue = ((val1 + val2 + val3)*1000);
        System.out.println(finalvalue);

        short sum =(short) ((val1 + val2 + val3)*1000);
        System.out.println(sum);
    }
}
