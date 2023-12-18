package practica1;
import java.util.Scanner;

/**
 * @author Veronica Oviedo
 * sumaproducto
 */
public class sumaproducto {

     public static void main (String[] args){
    //variables
    Scanner leer = new Scanner(System.in);
   int num1,num2,suma,producto;
   System.out.print("ingrese primer numero");
   num1 = leer.nextInt();
   System.out.print("ingrese segundo Numero");
   num2 = leer.nextInt();
   suma = num1 + num2;
   producto = num1 * num2;
   System.out.println("Resultado la suma es = " + suma);
   System.out.println("Resultado de la Multiplicacion =  " + producto);
 }
    


}
