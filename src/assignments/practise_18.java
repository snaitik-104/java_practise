package assignments;

public class practise_18 {

        public static int sum(int ...x)
        {
            int sum=0;
            for(int i=0;i<x.length;i++)
                sum=sum+x[i];
            return sum;
        }
        public static void main(String args[])
        {
            System.out.print(sum(10)+" ");
            System.out.print(sum(10,20)+" ");
            System.out.print(sum(10,20,30)+" ");
            System.out.print(sum(10,20,30,40)+" ");
        }
    }

//    output 10 30 60 100
// Var arg methods except any number of arguments including zero.
// Therefore , the output of the program will be the sum of all the arguments which are passed.