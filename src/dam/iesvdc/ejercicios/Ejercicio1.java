package dam.iesvdc.ejercicios;

public class Ejercicio1 {
 public static void main (String [] args ) {
	String cadena= "esta es la frase de cadena";
	boolean contiene= cadena.contains("libro");
	//System.out.println(contiene);
	System.out.printf( "¿La cadena %s contiene %s? %b%n",cadena, "libro ", contiene);
 
 }
}
