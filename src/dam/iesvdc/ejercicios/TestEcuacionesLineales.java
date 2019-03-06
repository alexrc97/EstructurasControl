package dam.iesvdc.ejercicios;

import java.util.Scanner;
public class TestEcuacionesLineales {
	public static void main (String [] args){
		Scanner sc =new Scanner (System.in);
		
		System.out.println ("Ecuaciones lineales");
		System.out.println ("a·x + b·y = e ");
		System.out.println ("---------------");
		System.out.println ("c·x + d·y = f ");
		System.out.println ("Introduce valores");
		
		System.out.print ("Valor de a: ");
		double a =sc.nextDouble();
		System.out.print ("Valor de b: ");
		double b =sc.nextDouble();
		System.out.print ("Valor de c: ");
		double c =sc.nextDouble();
		System.out.print ("Valor de d: ");
		double d =sc.nextDouble();
		System.out.print ("Valor de e: ");
		double e =sc.nextDouble();
		System.out.print ("Valor de f: ");
		double f =sc.nextDouble();
		sc.close();
		
		if ( ecuacionesLineales.esResoluble(a, b, c, d) ){

			double x = ecuacionesLineales.calcularX(a, b, c, d, e, f);
			double y = ecuacionesLineales.calcularY(a, b, c, d, e, f);
			System.out.printf("%nEl valor de x es %.2f y el valor de y es %.2f%n", x, y);

		}
		else {
			System.out.println("No se puede resolver el sistema de ecuaciones");	
			}
		}
	}
