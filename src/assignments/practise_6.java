package assignments;

public class practise_6 {
    public static void main(String[] args) {
        int x;
        if (args.length>0){
            x=10;
        }
//        System.out.(printlnx);
    }
}
/*
* t is never recommended to perform initialization for the local variable
*  inside logical blocks because there is no guarantee of executing that block.
* Hence compile time error variable x might not have been initialized.

* // variable x might not have been initialized
 */