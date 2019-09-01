public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        long hour = minutes / 60;
        long day = hour / 24;
        long year = day / 365;
        long remainDay = day % 365;
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else if (minutes >=0 && minutes < 1440){
            System.out.println(minutes + " min = 0 y and 0 d");
        }else if (minutes >= 1440 && minutes < 525600){

            System.out.println(minutes + " min = 0 y and " + day + " d");
        }else{
            System.out.println(minutes + " min = " + year + " y and " + remainDay + " d");
        }
    }
}
