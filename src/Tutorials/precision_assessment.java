package Tutorials;

public class precision_assessment {
    public static void main(String[] args) {

        float budget  = 1546.12f;
        float petrol = 84.11f;
        float diesel = 74.9f;

        float quantity_of_petrol = (budget/petrol);
        float quantity_of_diesel = (budget/diesel);

        System.out.println(quantity_of_petrol);
        System.out.println(quantity_of_diesel);

    }
}
