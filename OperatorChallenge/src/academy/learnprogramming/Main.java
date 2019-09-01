package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Create a double variable with a value of 20.00.");
        double myDouble = 20;
        System.out.println(myDouble);

        System.out.println("2. Create a second variable of type double with the value 80.00.");
        double mySecondDouble = 80;
        System.out.println(mySecondDouble);

        System.out.println("3. Add both numbers together and multiply by 100.00.");
        double myTotal = 100 * (myDouble + mySecondDouble);
        System.out.println(myTotal);

        System.out.println("4. Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00.");
        double myRemainder = myTotal % 40;
        System.out.println(myRemainder);

        System.out.println("5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero.");
        boolean isZero = (myRemainder == 0) ? true : false;
        System.out.println(isZero);

        System.out.println("6. Output the boolean variable.");
        System.out.println(isZero);

        System.out.println("7. Write an if-then statement that displays a message \"Got some remainder\" if the boolean in step 5 is not true.");

        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
