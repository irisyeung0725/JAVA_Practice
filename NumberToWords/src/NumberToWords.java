public class NumberToWords {

    public static int getDigitCount(int num){
        if (num < 0){
            return -1;
        }

        int time = 1;
        while (num >= 10){
            num /= 10;
            time++;
        }
        return time;
    }

    public static int reverse(int num){

        int sum = 0, r;
        while (num != 0){
            r = num % 10;
            sum = (sum * 10) + r;
            num /= 10;
        }

        return sum;
    }

    public static void numberToWords(int num){

        if (num < 0){
            System.out.println("Invalid Value");
        }

        int temp = reverse(num);

        while (temp >= 10){
            int digit = temp % 10;

            switch (digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");



            }

            temp /= 10;


        }

//        System.out.println(num);
//        System.out.println(getDigitCount(num));
//        System.out.println(getDigitCount(reverse(num)));





            switch (temp) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");

        }

        if (getDigitCount(num) != getDigitCount(reverse(num))) {

            int add = getDigitCount(num) - getDigitCount(reverse(num));
//            System.out.println(add);
// get the amount of zero needed to add
            for (int i = 1; i <= add; i++){
                System.out.println("Zero"); // use for loop to add zeros
            }

        }



    }
}
