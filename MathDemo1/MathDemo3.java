package MathDemo1;

public class MathDemo3 {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(997));
    }

    public  static boolean isPrimeNumber (int number){
        int  count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                return false;
            }

        }
        System.out.println(count);
        return true;


    }

}

