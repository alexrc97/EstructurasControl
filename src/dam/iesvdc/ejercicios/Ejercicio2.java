package dam.iesvdc.ejercicios;

import java.util.Scanner;
public class Ejercicio2 {
 public static void main (String [] args ) {
		Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce tu nombre ");
    String nombre = entrada.nextLine();
    entrada.close();
    System.out.println("--------------");
    System.out.println( "Hola " + nombre);
    
 
 }
}
