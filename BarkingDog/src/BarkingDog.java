public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking){
            return (hourOfDay < 8 && hourOfDay >=0) || (hourOfDay > 22 && hourOfDay <= 23);
        }
        return false;
    }
}

