package assignments;

public class practise_13 {
    //Fact(5) will calculate the factorial of 5 i.e. 5*4*3*2*1=120. Hence, the output is 120.
    static int fact (int i)
    {
        if (i == 0)
            return 1;
        else
            return i * fact (i - 1);
    }
        public static void main (String[]args)
        {
            int n=5;
            System.out.println(fact(5));
        }
}
