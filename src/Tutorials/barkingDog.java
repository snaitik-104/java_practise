package Tutorials;

public class barkingDog {

    public static boolean wakeUpDog(boolean wakeup, int hours) {
        if (hours >= 1 && hours <= 23) {
            if ((wakeup == true) && (hours < 8 || hours > 22)) {
                return true;
            }
            else {
                return false;
            }
        }
        return  false ;
    }

    public static void main(String[] args) {

        System.out.println(wakeUpDog(true,1));
        System.out.println(wakeUpDog(true,2));
        System.out.println(wakeUpDog(true,3));
        System.out.println(wakeUpDog(true,4));
        System.out.println(wakeUpDog(true,5));
        System.out.println(wakeUpDog(true,6));
        System.out.println(wakeUpDog(true,7));
        System.out.println(wakeUpDog(true,8));
        System.out.println(wakeUpDog(true,9));
        System.out.println(wakeUpDog(true,10));
        System.out.println(wakeUpDog(true,11));
        System.out.println(wakeUpDog(true,12));

    }
}
