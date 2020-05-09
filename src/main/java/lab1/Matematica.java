package lab1;

public class Matematica {

    public static boolean prime_test(int numero){

        boolean isPrime = true;

        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;

    }

}
