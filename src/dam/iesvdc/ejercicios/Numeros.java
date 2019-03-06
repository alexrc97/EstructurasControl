package dam.iesvdc.ejercicios;

public class Numeros {
	public static void ImprimirNumeros1al10(){
		int contador = 0;
		for (int i=0 ; i<10 ; i++){
			System.out.println (contador);
			contador++;
			}
		}
	public static void ImprimirNumerosde5en5() {
		for (int i=25 ;i<85 ; i+=5){
			System.out.println (i);
			}
		}
		public static void Regresionde2en2 (){
		int i=102;
		do {
		i-=2;
		System.out.println (i);}
		while (i>50);
		}
		public static void CalcularSuma (int n){
			int suma=0;
			for (int i=0; i<=n ; i++){
				suma= suma + i;
				}
			System.out.println("El sumatorio del numero "+ n +" es "+suma);
			}
		public static void CalcularSumadeCuadrados (int n){
			int suma =0;
			for (int i=0; i<=n ; i++){
				suma= suma + (i*i);
				}
			System.out.println("El sumatorio de los cuadrados del numero "+ n +" es "+suma);
			}
		public static void CalcularSumasPareseImpares (int n) {
			int sumaPares=0;
			int sumaImpares=0;
			for (int i=0; i<=n ; i+=2){
				sumaPares= sumaPares + i;
				}
			for (int i=1; i<=n ; i+=2){
				sumaImpares=sumaImpares+i;
				}
			System.out.println("El sumatorio de los numeros pares hasta el numero "
			+ n + " es: " + sumaPares + " y de los numeros impares hasta "+ n + " es: " + sumaImpares);	
			}
}	
	
