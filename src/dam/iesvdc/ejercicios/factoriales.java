package dam.iesvdc.ejercicios;

import java.util.Scanner;
public class factoriales {
	public static void main (String args[]){
		int numero;
		Scanner sc=new Scanner(System.in);
		System.out.println("Comienzo del programa escribe el " +
		"numero del que deseas hacer factorial: " );
		numero=sc.nextInt();
		sc.close();
		int contador = 0;
		int factorial =1;
		while (contador<numero){
				factorial=factorial*(++contador);
				}
		while (contador>numero){
				
				factorial = factorial*(--contador);
				
				}		
			System.out.println ("El factorial de " + numero + " es: " + factorial);
		}
	}
