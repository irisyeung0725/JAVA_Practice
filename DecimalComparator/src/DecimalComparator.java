public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstDec, double secondDec){
        return (firstDec == secondDec) || (Math.abs(firstDec - secondDec) >= 0.0001);
    }
}
