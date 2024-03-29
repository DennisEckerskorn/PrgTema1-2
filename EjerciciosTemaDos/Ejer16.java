import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejer16{
	public static void main(String[] args) {
		//Variables del programa.
		Scanner lector = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		//He usado el DecimalFomat para sacar 2 decimales al final del resultado, con el float a veces saca 2 decimales y en otros valores 3 decimales.
		double eurosUsuario;
		double resultadoConversionDolares;
		double resultadoConversionLibras;
		//Los valores cambian cada día, pero para que en el programa no se alteren los valores las he declarado constantes.
		double DOLARES = 1.0608;
		double LIBRAS = 0.8664;
		//Pedimos una cantidad a convertir en euros y guardamos el valor en la variable euroUsuarios.
		System.out.println("Dime una cantidad en Euros:");
		eurosUsuario = Double.parseDouble(lector.nextLine());
		//Operaciones para convertir euros a dólares y libras.
		resultadoConversionDolares = eurosUsuario * DOLARES;
		resultadoConversionLibras = eurosUsuario * LIBRAS;
		//Se imprime el resultado por pantalla.
		System.out.println(df.format(eurosUsuario) + " euros son " + df.format(resultadoConversionDolares) + "$(Dólares) y " + df.format(resultadoConversionLibras) + "£(GBP).");
		//Cierro el Scanner.
		lector.close();	
	}
}