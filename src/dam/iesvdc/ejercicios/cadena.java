package dam.iesvdc.ejercicios;

public class cadena {
	public static void main (String [] args) {
	String cadena = "prueba";
	int LongitudCadena = cadena.length();
	for (int i = 0; i<LongitudCadena ; i++) {
		if ( cadena.charAt(i) == 'o' ){
			
			cadena.replace(cadena.charAt(i),'O'); 
			}
		if ( cadena.charAt (i) == 'a'){
			
			cadena.replace(cadena.charAt(i),'A');
			}	
				
		}
			System.out.println (cadena);
	}
}
