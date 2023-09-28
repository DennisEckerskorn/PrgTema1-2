import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejer14 {
	public static void main(String[] args) {
		//Declaración de las variables.
		DecimalFormat df = new DecimalFormat("0.##");
		Scanner lector = new Scanner(System.in);
		double radio, longitud, area;
		final double PI = 3.1416;

		//Pedimos el radio de la circunferencia por pantalla.
		System.out.println("Dime el Radio de la circunferencia en centímetros");
		radio = Double.parseDouble(lector.nextLine());

		//Sacamos el resultado de las operaciones matemáticas y la guardamos en la variable.
		longitud = 2*PI*radio;
		area = PI*(radio*radio);

		//Imprimimos los resultados por pantalla.
		System.out.println("La longitud del radio son " + df.format(longitud) + "cm.");
		System.out.println("El área de la circunferencia son " + df.format(area) + "cm.");
		//Cerramos el Scanner.
		lector.close();
	}
}