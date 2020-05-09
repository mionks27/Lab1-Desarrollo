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
    public static int mcd(int num1,int num2){
       int mayor=Math.max(num1,num2);
        int menor=Math.min(num1,num2);
        
        if(mayor%menor==0){
            return menor;
        }else{
            return mcd(menor,mayor%menor);
        }
        
    }

    public static int factorialCalc(int numero){

        int fact = 1;

        for (int i = 1; i < numero; i++){
            fact = fact*i;
        }

        return fact;

    }

}
