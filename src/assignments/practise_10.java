package assignments;

public class practise_10 {

        public static void m2 ()
        {
            System.out.print ("m2 ");
        }

        public static void m1 ()
        {
            m2 ();
            System.out.print ("m1 ");
        }

        public static void main (String[]args)
        {
            m1 ();
            System.out.println ("main");
        }
    }
// output --> m2 m1 main

/*
* main() method calls m1() method which calls m2() method, therefore At first,
* m2() method will execute completely which print “m2”, then m1() method will execute completely
* which print “m1” and at last the control reaches to main method and it will print “main” as an output.

Hence, the output of the program is “m2 m1 main”.

*/
