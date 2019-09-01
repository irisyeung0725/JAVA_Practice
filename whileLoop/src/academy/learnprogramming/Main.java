package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while (count != 5){
            System.out.println("count value is " + count);
            count += 1;
        }

        for (count =0; count < 6; count++){
            System.out.println("count value is " + count);
        }

        System.out.println("-----------------------------------");

        System.out.println("Here starts with the do-while loop");
        System.out.println("-----------------------------------");
        count = 2;
        do {
            System.out.println("Count value was " + count);
            count++;
        }while (count < 2);
    }
}
