package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = getResult(5);
        System.out.println(result);
    }

    public static int getResult(int n){
        int randomNum = 3;
        return randomNum - n;
    }

}
