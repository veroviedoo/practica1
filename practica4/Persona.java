package practica4;

import java.util.Scanner;

/**@author Veronica Oviedo
 * Persona
 */
public class Persona {

     private Scanner scanner;
    private String nombre;
    private int edad;
   public void inicializar(){
   scanner = new Scanner(System.in);
   System.out.print("ingrese nombre: ");
   nombre = scanner.nextLine();
    System.out.print("Digite edad : ");
   edad =  scanner.nextInt();
}
public void imprimir(){
  System.out.println("Nombre ingresado = " + nombre);
   System.out.println("Edad  digitado  = " + edad);
}
 public void buscaMayor (){
  if (edad >= 18) {
    System.out.println(nombre + " es mayor de edad.");
  }else{
   System.out.println(nombre + " es Menor de edad.");
    
  }

 }

 public static void main(String[] args) {
  Persona persona = new Persona();
  persona.inicializar();
  persona.imprimir();
  persona.buscaMayor();
}
}
