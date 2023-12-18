package Practica2;

import java.util.Scanner;

/**
 *@author Veronica Oviedo
 * practica2ejercicio01
 */
public class practica2ejercicio01 {
 static String red = "\033[31m";
  static String green = "\033[32m";
  static String reset = "\u001B[0m";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variable
        float ingresos;
        float irp= 80000000;
        //entrada
        System.out.println("ingrese el ingreso anual:");
        ingresos = scanner.nextFloat();
        //condicion
        if (ingresos> irp) {
            System.out.print( reset +"Debe abonar IRP el siguiente año: ");
        }else{
            System.out.print( green + "No abona IRP");
        }
        scanner.close();
       System.out.print(reset);
    }
}
    
