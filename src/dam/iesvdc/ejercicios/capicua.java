package dam.iesvdc.ejercicios;

import java.util.Scanner;
/**
 *	 Programa que comprueba si un numero introducido es capicua 
 * @author Alejandro
 * @version 1.0
 */
public class capicua {
	/**
	 * Metodo principal main donde llamamos al metodo que hace la
	 * comprobacion de si un numero es capicua
	 */
	public static void main (String [] args) {
	Scanner sc = new Scanner (System.in);
	sc.close();
	int numeroLeido = sc.nextInt();
	EsCapicua (numeroLeido);
	}
	/**
	 * Metodo EsCapicua que devuelve true o false segun
	 * si el numero introducido es capicua o no
	 * @param int n
	 * @return boolean
	 */
	public static boolean EsCapicua(int n) {
	int primerNumero = n/100;
	int segundoNumero = (n%100)/10;
	int tercerNumero = (n%100)%10;
	if ((primerNumero*100)+(segundoNumero*10)+tercerNumero == n ){
		 System.out.println ("El numero " + n + " es capicua");
		} else System.out.println ("El numero " + n + " no es capicua");
	return true;
	}
}

