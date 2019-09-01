public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int sum = 0;
        int temp = number;

        while (temp != 0){
            int r = temp % 10;
            sum = (sum *10) + r;
            temp = temp / 10;
        }
        System.out.println(sum);
        System.out.println(number);

        if (sum == number){
            return true;
        }

        return false;

    }
}
