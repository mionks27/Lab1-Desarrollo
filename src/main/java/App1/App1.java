/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App1;

import java.util.Scanner;
import static lab1.App.accion;
import lab1.Matematica;
import lab1.Menu;

/**
 *
 * @author the-k
 */
public class App1 extends Menu {
 Scanner scanner=new Scanner(System.in);
    @Override
    public void mostrarMenu() {
        int entrada=0;
         do{
            System.out.println("MENU de app 1");
            System.out.println("INGRESE UNAOPCION");
            
            System.out.println("1.-VERIFICAR SI ES PRIMO");
            System.out.println("2.-MCD");
            System.out.println("3.-FIBONACCI");
            
            System.out.println("4.-FACTORIAL");
            
            System.out.println("5.-SALIR");
            
            
               while(entrada!=1 && entrada!=2&&entrada!=3&&entrada!=4&&entrada!=5){
                   System.out.println("INGRESE UNA OPCION VALIDA");
                   entrada=scanner.nextInt();
               }
               if(entrada==1||entrada==2||entrada==3||entrada==4){
                   accion(entrada);
               }
            
        }while(entrada!=3);
       }

    @Override
    public void Accion(int acc) {
              Matematica obj1=new Matematica();
        if(acc==2){
               System.out.println("ingrese 2 numeros para sacar el MCD");
            int num2=scanner.nextInt();
            int num1=scanner.nextInt();
      
            Matematica.mcd(num2,num1);
            
        }else if(acc==1){
            boolean a;
               System.out.println("ingrese un numero para ver si es primo");
            int num3=scanner.nextInt();
            a=Matematica.prime_test(num3);
            if(a){
                   System.out.println("ES PRIMO");
            }else{
                   System.out.println("no es primo");
            }
        }else if(acc==3){
            System.out.println("iNGRESE L TERMINO DE FIBONACCI QUE QUIERE SABER");
            int serie=0;
            serie=scanner.nextInt();
            Matematica.nFibonacci(serie);
            
        }else if(acc==4){
            System.out.println("ingrese el numero para sacarle factorial");
            int num4=scanner.nextInt();
           int b;
                  b = Matematica.factorialCalc(num4);
                  System.out.println("el factorial es "+b);
            
        }
        }
    
}
