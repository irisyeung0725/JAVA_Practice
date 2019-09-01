package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        int myIntValue = 5 /3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        System.out.println("-------------------");
        System.out.println("Here below is the challenge: to convert a given number of pounds to kilograms");

        double myGivenPoundValue = 200;
        double myConvertedKgValue = myGivenPoundValue * 0.45359237;
        double anotherNumber = 3_000_000.1_231d;

        System.out.println(myConvertedKgValue);
        System.out.println(anotherNumber );




    }
}
