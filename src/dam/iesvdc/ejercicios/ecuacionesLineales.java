package dam.iesvdc.ejercicios;

/** Clase que aporta metodos
 * para la resolucion de un sistema
 * de dos ecuaciones con dos incógnitas
 * con la estructura:
 * <br> a · x + b·y = e
 * <br> c · x + d·y = f
 * @author Alejandro R.
 * @version 1.0
 */
public class ecuacionesLineales {
	/** Metodo esResoluble que nos dice
	 * si un sistema de dos ecuaciones
	 * con dos incognitas se puede resolver
	 * @param a valor que acompaña a la x en la primera ecuacion
	 * @param b valor que acompaña a la y en la primera ecuacion
	 * @param c valor que acompaña a la x en la segunda ecuacion
	 * @param d valor que acompaña a la y en la segunda ecuacion
	 * <br><br>
	 * @return tru si el sistema de ecuaciones se puede resolver con una solución única
	 * ,en caso contrario devuelve false
	 */
	  
	public static boolean esResoluble (double a,double b, double c, double d){
		
			return a*d-b*c!=0;
			}
			/**Método que nos devuelve el valor de x en la resolucion del sistema de 				 
			 *dos ecuaciones con 
			 * dos incognitas
			 * @param a valor que acompaña a la x en la primera ecuacion
			 * @param b valor que acompaña a la y en la primera ecuacion
			 * @param c valor que acompaña a la x en la segunda ecuacion
			 * @param d d valor que acompaña a la y en la segunda ecuacion
			 * @param e termino independiente de la pimera ecuacion
			 * @param f termino independiente de la segunda ecuacion
			 * <br><br> 
			 * @return El valor de la x del sistema de ecuaciones
			 */ 
	public static double calcularX (double a,double b, double c, double d,double e,double f){
			
			return (e*d-b*f)/(a*d-b*c);
			}
			/**Método que nos devuelve el valor de y en la resolucion del sistema de 				 
			 *dos ecuaciones con 
			 * dos incognitas
			 * @param a valor que acompaña a la x en la primera ecuacion
			 * @param b valor que acompaña a la y en la primera ecuacion
			 * @param c valor que acompaña a la x en la segunda ecuacion
			 * @param d d valor que acompaña a la y en la segunda ecuacion
			 * @param e termino independiente de la pimera ecuacion
			 * @param f termino independiente de la segunda ecuacion
			 * <br><br> 
			 * @return El valor de la y del sistema de ecuaciones
			 */ 
	public static double calcularY(double a,double b, double c, double d,double e,double f){
			
			return (a*f-e*c)/(a*d-b*c);
			}
}
