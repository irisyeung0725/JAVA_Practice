package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1+2=3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous result is " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("the remainder of 4 % 3 is " + result);

        result ++; // 1 + 1 = 2
        // equals to result += 1
        System.out.println("1 + 1 = " + result);

        result --; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);


        System.out.println("------------------");
        System.out.println("if/then statement");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And im scared of Aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100 )) {
            System.out.println("Greater than second top score and less th an 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the condition are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean justTest = false;
        if (justTest) {
            System.out.println("False");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}
