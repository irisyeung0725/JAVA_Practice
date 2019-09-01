public class EvenDigitSum {


    public static int getEvenDigitSum(int number){

        if (number < 0){
            return -1;
        }

        int sum = 0, digit;
        while (number >= 10){
            digit = number % 10;
            if (digit % 2 == 0){
                sum += digit;
                System.out.println("The sum except first digit" + sum);
            }
            number /= 10;

        }
        if (number % 2 == 0){
            sum += number;
        }
        return sum;


    }
}
