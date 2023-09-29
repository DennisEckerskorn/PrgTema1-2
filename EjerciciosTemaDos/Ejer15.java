import java.util.Scanner;
public class Ejer15 {
	public static void main(String[] args) {
		//Variables:
		Scanner lector = new Scanner(System.in);
		double gradosKelvin;
		double gradosCelsius;
		double gradosFahrenheit;
		//Se pide el valor en grados centígrados al usuario y se guarda el numero en la variable.
		System.out.println("Ingresa la temperatura en grados centígrados:");
		gradosCelsius = Double.parseDouble(lector.nextLine());
		//Operaciones para convertir ºC a K y ºF.
		gradosKelvin = 273.15 + gradosCelsius;
		gradosFahrenheit = gradosCelsius * (9f/5) + 32;
		//Imprimimos el resultado por pantalla.
		System.out.println(gradosCelsius + "ºC son " + gradosKelvin + " K y " + gradosFahrenheit + " ºF");
		//Cerramos el Scanner.
		lector.close();
	}
}