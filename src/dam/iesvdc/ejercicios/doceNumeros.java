package dam.iesvdc.ejercicios;

import java.util.Scanner;
public class doceNumeros {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Introduce 12 numeros reales y escribe fin");
		int contador=0;
		while (sc.hasNextFloat()){
			float numero=sc.nextFloat();
			System.out.printf ("%10.2f ",numero);
			contador++;
			if(contador%4==0)
			System.out.println();
			}
		}
	}
