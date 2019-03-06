package dam.iesvdc.teoria;
public class metodos{
	public static void main (String [] args) {
		mostrarNumeros(10);
		mostrarRangoNumeros(3,10);
	}
	
	public static void mostrarNumeros (int numero){
		int contador=0;
		System.out.println("Mostramos numeros hasta 3 ");
		while (contador<=numero) {
			System.out.println(contador);
			contador++;
		}
	}
	public static void mostrarRangoNumeros (int numero1, int numero2){
		System.out.println("Mostramos numeros desde el 3 hasta el 10 y confirmamos si es par o impar ");
		if(numero1<numero2){
			int contador= numero1;
			while( ( contador>=numero1 ) && (contador<=numero2) ){
				if (contador%2==0){
					System.out.println( "El numero " + contador + " y es par" );	
					}
				if (contador%2!=0){
					System.out.println( "El numero " + contador + " y es impar" );
					}	
				contador++;
		}
		 
			System.out.println( numero1 + " es mas grande o igual que " + numero2 );
			
		}
	}

	
}
