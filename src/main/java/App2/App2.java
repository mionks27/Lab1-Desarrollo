/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App2;

import lab1.Matematica;
import lab1.Menu;
import lab1.pregunta2;

import java.util.Scanner;

import static lab1.App.accion;

/**
 *
 * @author the-k
 */

public class App2 extends Menu {


    @Override
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int entrada = 0;
        do {
            System.out.println("MENU de app 2");
            System.out.println("INGRESE UNAOPCION");

            System.out.println("1.-LISTAR");
            System.out.println("2.-CREAR");
            System.out.println("3.-SALIR");

            System.out.println("4.-FACTORIAL");

            System.out.println("5.-SALIR");


            while (entrada != 1 && entrada != 2 && entrada != 3 && entrada != 4 && entrada != 5) {
                System.out.println("INGRESE UNA OPCION VALIDA");
                entrada = scanner.nextInt();
            }
            if (entrada == 1 || entrada == 2 || entrada == 3 || entrada == 4) {
                accion(entrada);
            }

        } while (entrada != 3);
    }

    @Override
    public void Accion(int acc) {
        if(acc==2){
            pregunta2 p = new pregunta2();
            p.crearPersonas();

        }else if(acc==1){
            pregunta2 p = new pregunta2();
            p.listraPersonas();

        }else if(acc==3){



    }
}
    }

