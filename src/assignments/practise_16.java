package assignments;

class Payload
{
    private int weight;
    public Payload (int w)
    {
        weight = w;
    }

    public void setWeight (int w)
    {
        weight = w;
    }

    public String toString ()
    {
        return Integer.toString (weight);
    }
}
public class practise_16 {

        static void changePayload (Payload p)
        {
            /* insert code */   // line 1
        }

        public static void main (String[]args)
        {
            Payload p = new Payload (300);
            p.setWeight (170);
            changePayload (p);
            System.out.println ("p is " + p);
        }
    }

//Which code fragment, inserted at line 1, produces the output p is 170?