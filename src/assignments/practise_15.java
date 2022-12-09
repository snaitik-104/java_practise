package assignments;

public class practise_15
{

        public static void main (String[]args)
        {
            int num = 7;
            practise_15 m = new practise_15();
            m.func(num);
            System.out.print(" main num = " + num);
        }
        void func ( int num)
        {
            System.out.print(" func num = " + num++);
        }

}

// output = func num = 7 main num = 7
/*
* The post increment is performed inside the local variable of func() method.
* Therefore the value of the local variable of main function will not be affected.
 */