import java.util.Scanner;
public class Ejer17 {
	public static void main(String[] args) {
		//Variables.
		Scanner lector = new Scanner(System.in);
		double precioLitro;
		double totalPagado;
		double kmCuentakilometrosPrincipio;
		double kmCuentakilometrosFinal;
		double litrosRepostadosPrimer;
		double litrosRepostadosSegunda;
		double kmRecorridos;
		double consumoMedio;
		double totalLitros;
		double costeKilometro;

		//Se piden los datos del primer repostaje
		System.out.println("¿Cuánto cuesta el litro del combustible en el primer repostaje?");
		precioLitro = Double.parseDouble(lector.nextLine());

		System.out.println("¿Cuánto has pagado por el primer repostaje?");
		totalPagado = Double.parseDouble(lector.nextLine());
		
		System.out.println("¿Cuántos KM te marca el cuentakilómetros");
		kmCuentakilometrosPrincipio = Double.parseDouble(lector.nextLine());
		//Se sacan los litros repostados del primer repostaje.
		litrosRepostadosPrimer = totalPagado / precioLitro;
		//Se saca el resultado por pantalla.
		System.out.println("Has repostado " + litrosRepostadosPrimer + " litros en el primer repostaje.");
		//Se piden los datos del segundo repostaje.
		System.out.println("¿Cuánto cuesta el litro de combustible en el segundo repostaje?");
		precioLitro = Double.parseDouble(lector.nextLine());
		
		System.out.println("¿Cuánto has pagado por el segundo repostaje");
		totalPagado = Double.parseDouble(lector.nextLine());

		litrosRepostadosSegunda = totalPagado / precioLitro;

		System.out.println("Has repostado " + litrosRepostadosSegunda + " litros en el segundo repostaje.");

		System.out.println("¿Cuántos KM te marca el cuentakilómetros");
		kmCuentakilometrosFinal = Double.parseDouble(lector.nextLine());

		kmRecorridos = kmCuentakilometrosFinal - kmCuentakilometrosPrincipio;

		System.out.println(kmRecorridos);
		
		totalLitros = litrosRepostadosPrimer + litrosRepostadosSegunda;
		consumoMedio = totalLitros * 100 / kmRecorridos;
		costeKilometro = totalPagado / kmRecorridos; //falta sumar totalpagado

		System.out.println("El consumo medio cada 100KM son " + consumoMedio + " litros.");
		System.out.println("El coste para cada kilometro son " + costeKilometro + " euros.");
	}
}