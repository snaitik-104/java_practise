package assignments;

public class practise_17 {


        public static void main (String[]args)
        {
            m1();
       //     m2(); // cause of error
        }

        static void m1 ()
        {
            System.out.println ("Static Called");
        }
        void m2 ()
        {
            System.out.println ("Non Static Called");
        }
    }
//generate an error
//non-static method m2() cannot be referenced from a static context

//explanation:
//Non-static methods cannot be called directly from the static context.
// We can call non-static methods by using object of that class.