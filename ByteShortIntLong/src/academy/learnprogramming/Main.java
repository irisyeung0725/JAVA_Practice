package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue -1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        System.out.println(myMinByteValue / 2);

        byte myNewByteValue = (byte)(myMaxByteValue / 2);
        System.out.println(myNewByteValue);

        System.out.println("-----------------");
        System.out.println("From here below is the challenge");

        byte myRandomByteValue = 10;
        short myRandomShortValue = 13;
        int myRandomIntegerValue = 22;
        long myFinalLongValue = 5000 + 10*(myRandomByteValue + myRandomShortValue + myRandomIntegerValue);

        short shortTotal = (short)(1000 + 10 *
                (myRandomByteValue + myRandomShortValue + myRandomIntegerValue));

        System.out.println(myFinalLongValue);
        System.out.println(shortTotal);
        System.out.println(myLongValue);
    }
}
