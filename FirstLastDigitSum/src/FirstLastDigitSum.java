public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }

        int lastDigit = number % 10;
        System.out.println(lastDigit);
//        number = number / 10;
        System.out.println(number);
        while (number >= 10){
            number = number / 10;
        }

        int firstDigit = number;
        int sum = lastDigit + firstDigit;
        return sum;
    }
}
