package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumberCount = 0;

        while (number <= finishNumber){
            number++;
            if (isEvenNumber(number)){
                System.out.println("Even number " + number);
                evenNumberCount++;
            }

            if (evenNumberCount>=5) {
                break;
            }

        }
        System.out.println("Total even number found "+ evenNumberCount);
    }

    public static boolean isEvenNumber(int number){

        if ((number % 2) ==0){
            return true;
        }
        return false;


    }
}