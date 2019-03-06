package dam.iesvdc.ejercicios;

public class hora {
		public static void main (String [] args){
			if (args.length<3 || args.length>3 ){
				System.out.println("No tiene tres argumentos");
				System.exit (1);
				}
			String horas = args[0];
			int ihora = Integer.parseInt ( horas );
			String minutos = args[1];
			int iminutos = Integer.parseInt( minutos );
			String segundos = args[2];
			int isegundos = Integer.parseInt( segundos );
			System.out.printf ("La hora leida es %s:%s:%s:%n" ,horas,minutos,segundos);
			
			if (ihora>=0 && ihora<24 && iminutos >=0 && iminutos<60 && isegundos>=0 && isegundos<60)
				System.out.println ("Hora válida");

			else System.out.println ("Hora no válida");
			
			
		}
}
