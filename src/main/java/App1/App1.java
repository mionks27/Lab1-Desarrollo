/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App1;

import java.util.Scanner;
import static lab1.App.accion;
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
            System.out.println("MENU PRINCIPAL");
            System.out.println("INGRESE UNAOPCION");
            
            System.out.println("1.-APP_1");
            System.out.println("2.-APP_2");
            System.out.println("3.-SALI");
            
            
               while(entrada!=1 && entrada!=2&&entrada!=3){
                   System.out.println("INGRESE UNA OPCION VALIDA");
                   entrada=scanner.nextInt();
               }
               if(entrada==1||entrada==2){
                   accion(entrada);
               }
            
        }while(entrada!=3);
       }

    @Override
    public void Accion(int acc) {
        }
    
}
