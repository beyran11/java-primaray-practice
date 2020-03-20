package mth.numeric.functions;

public class MyNumber {

    private int number;

    public MyNumber() {
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for(int i = 2; i <= number - 1; ++i) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public int multiplyUptoN(int number) {
        int mul = 1;

        for(int i = 1; i <= number; ++i) {
            mul *= i;
        }

        return mul;
    }

    public int sumUptoN(int number) {
        int sum = 0;

        for(int i = 1; i <= number; ++i) {
            sum += i;
        }

        return sum;
    }

    public boolean isOdd(int number) {
        if (number < 2) {
            return false;
        } else {

                if (number % number == 0) {
                    return false;
                }

            return true;
        }
    }


}


