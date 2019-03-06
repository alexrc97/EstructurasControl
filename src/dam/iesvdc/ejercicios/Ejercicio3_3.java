package dam.iesvdc.ejercicios;

import java.util.Scanner;
public class Ejercicio3_3 {
	public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println( "Escribe un numero de tres cifras ");
	int numero = sc.nextInt();
	sc.close();
	if (numero<0)
	System.out.println ("Error el numero " + numero + " es menor que 0");
	if (numero>999)
	 System.out.println ("Error el numero " + numero + " tiene mas de 3 cifras");
	}
}
