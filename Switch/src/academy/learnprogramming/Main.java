package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
        }

        // more code here


        System.out.println("Here's the challenge");

        char charValue = 'A';
        switch (charValue) {

            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;

            case 'C':
                System.out.println("C");
                break;

            case 'D':
                System.out.println("D");
                break;

            case 'E':
                System.out.println("E");

            default:
                System.out.println("not found");
        }
    }
}
