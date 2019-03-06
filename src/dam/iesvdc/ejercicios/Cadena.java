package dam.iesvdc.ejercicios;

import java.lang.String;
public class Cadena {
	public static void main (String [] args) {
	String cadena = "proeba";
	int LongitudCadena = cadena.length();
	System.out.println (LongitudCadena);
	for (int i = 0; i<LongitudCadena ; i++) {
		if ( cadena.charAt(i) == 'o' ){
			
			cadena.replace('o','1'); 
			}
		if ( cadena.charAt(i) == 'a'){
			
			cadena.replace('a','2');
			}	
				
		}
			System.out.println (cadena);
	}
}
