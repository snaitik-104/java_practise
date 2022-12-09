package assignments;

public class practise_14 {

        public static void test (String str)
        {
            int check = 4;
            if (check == str.length ())
            {
                System.out.print (str.charAt (check -= 1) + ", ");
            }
            else
            {
                System.out.print (str.charAt (0) + ", ");
            }
        }
        public static void main(String[] args)
        {
            test("four");
            test("tee");
            test("to");
        }
    }
/*
* If the length of the string is 4 then the function will print the last character present in a
* string else it will print the first character of the string.

In our case

test(“four”) => length :4 // print last character ‘r’

test(“tee”) => length : 3 // print first character ‘t’

test(“to”) => length: 2 // print first character ‘t’


Hence the output is “r,t,t”.*/
