public class LeapYear {

    public static boolean isLeapYear(int year){
        if (year > 0 && year < 10000) {
            return ((year % 4 == 0) && (year % 100 != 0)) ||
                    ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0));
        }
        return false;
    }
}
