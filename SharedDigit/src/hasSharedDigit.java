public class hasSharedDigit {

    public static boolean hasSharedDigit(int a, int b){

        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)){
            int firstADigit, secondADigit, firstBDigit, secondBDigit;

            firstADigit = a % 10;
            firstBDigit = b % 10;
            secondADigit = a / 10;
            secondBDigit = b / 10;
            if ((firstADigit == firstBDigit) || (secondADigit == secondBDigit) ||
                    (firstADigit == secondBDigit) || (firstBDigit == secondADigit)){
                return true;
            }
        }
        return false;
    }
}
