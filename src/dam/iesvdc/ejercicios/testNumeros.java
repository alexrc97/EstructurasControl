package dam.iesvdc.ejercicios;

import java.util.Scanner;
public class testNumeros {
	public static void main (String [] args) {
		System.out.println( "Metodo que imprimie del 1 al 10" );
		Numeros.ImprimirNumeros1al10();
		System.out.println( "Metodo que imprime del 25 al 80 de 5 en 5" );
		Numeros.ImprimirNumerosde5en5();
		System.out.println( "Metodo que imprime cuenta regresiva de 2 en 2" );
		Numeros.Regresionde2en2();
		System.out.println( "Metodo que imprime el sumatorio del numero introducido" );
		Scanner pepe = new Scanner (System.in);
		pepe.close();
		int n=pepe.nextInt();
		Numeros.CalcularSuma(n);
		System.out.println( "Metodo que imprime el sumatorio de los "
		+"cuadrados del numero introducido" );
		int n2=pepe.nextInt();
		Numeros.CalcularSumadeCuadrados(n2);
		System.out.println( "Metodo que imprime el sumatorio de los"
		+" numeros pares e impares hasta el numero introducido");
		int n3=pepe.nextInt();
		Numeros.CalcularSumasPareseImpares(n3);
		}
	}
