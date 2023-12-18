package Practica3;

import java.util.Scanner;

/**
 * @author Veronica Oviedo
 * practica3ejercicow2
 */
public class practica3ejercicow2 {

     public static void main(String[] args) {
    {
                //variables
                Scanner scanner = new Scanner(System.in);
                String usuario;
                String usuarioCorrecto= "admin";
                int pin;
                int pincorrecto= 1234567; 
                int correcto = 0;
                 System.out.println("Acceso al sistema");
                while (correcto <= 0) {
                    // entradas
                       System.out.print("Ingrese usuario:  ");
                usuario = scanner . nextLine();
                 System.out.print("Ingrese pin:   ");
                pin = scanner.nextInt();
               if ((usuario.equals(usuarioCorrecto))&& (pin==pincorrecto)) {
                correcto=1;
               }
                System.out.println("Usuario y/o pin incorecto  ");
                scanner.nextLine(); //reset string
             }
                System.out.println("Bienvenido al sistema  ");
                scanner.close();
            } 
        }
    
    }


