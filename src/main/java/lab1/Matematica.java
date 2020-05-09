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

    public static int factorialCalc(int numero){

        int fact = 1;

        for (int i = 1; i < numero; i++){
            fact = fact*i;
        }

        return fact;

    }

    public static int nFibonacci(int n){


        int F1 = 0;
        int F2 = 1;
        int Fn = 1;

        if (n == 1){
            Fn = 0;
        }
        else if(n == 2){
            Fn = 1;
        }
        else{
            for (int i = 0; i < (n-3); i++){
                Fn = F1 + F2;
                F1 = F2;
                F2 = Fn;

            }
        }

        return Fn;

    }

}
