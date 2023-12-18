package Practica2;

import java.util.Scanner;

/**
 * @author Veronica Oviedo
 * practica2ejercicio2
 */
public class practica2ejercicio2 {

     public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
int num1,num2;
System.out.print("Digite primer numero");
num1 = scanner.nextInt();
System.out.print("Digite el segundo Numero");
num2 = scanner.nextInt();
//condicional
if (num1>num2){
System .out.print ("Primer Numero es mayor");

} else if (num2>num1) {
  System .out.print ("Segundo es mayor");  
}else{
System .out.print ("son iguales");

}

scanner.close();


}
   
   
    







}

