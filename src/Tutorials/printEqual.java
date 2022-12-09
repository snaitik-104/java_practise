package Tutorials;

public class printEqual {

    private static void printEquity(int a , int b , int c){
        if((a<0) || (b<0) || (c<0)){
            System.out.println("Invalid Value");
        } else if ((a==b)&&(a==c)&&(b==c)) {
            System.out.println("All Values are same");
        }
        else{
            System.out.println("All values are different");
        }
    }

    public static void main(String[] args) {
        printEquity(1, 1, 1);
        printEquity(1, 1, 2);
        printEquity(-1, -1, -1);
        printEquity(1, 0, 3);

    }
}
