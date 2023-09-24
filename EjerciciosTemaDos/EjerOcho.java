//Se importa la clase Scanner.

import java.util.Scanner;

public class EjerOcho {
	public static void main (String[] args){
		//Declaración de las variables del programa.
		Scanner lector = new Scanner(System.in);
		int edadPersona;
		int dias;
		int anyo = 365;
		
		//Se pide la edad en años al usuario y se guarda el valor en la variable edadPersona.
		System.out.println("¿Cuántos años tienes?");
		edadPersona = Integer.parseInt(lector.nextLine());
		
		//Se multiplican 365 por el año indicado. No se tienen en cuenta años bisiestos.
		dias = edadPersona * anyo;
		
		//Se imprime el resultado por pantalla.
		System.out.println("Tienes " + edadPersona + " años lo que equivale a " + dias + " días");

	}
}