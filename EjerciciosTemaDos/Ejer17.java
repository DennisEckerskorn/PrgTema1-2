import java.util.Scanner;
public class Ejer17 {
	public static void main(String[] args) {
		//Variables.
		Scanner lector = new Scanner(System.in);
		double precioLitro;
		double totalPagado;
		double totalPagadoPrimera;
		double totalPagadoSegunda;
		double kmCuentakilometrosPrincipio;
		double kmCuentakilometrosFinal;
		double litrosRepostadosPrimera;
		double litrosRepostadosSegunda;
		double kmRecorridos;
		double consumoMedio;
		double totalLitros;
		double costeKilometro;

		//Se piden los datos del primer repostaje y se guardan los valores en las variables correspondientes.
		System.out.println("¿Cuánto cuesta el litro del combustible en el primer repostaje?");
		precioLitro = Double.parseDouble(lector.nextLine());
		System.out.println("¿Cuánto has pagado por el primer repostaje?");
		totalPagadoPrimera = Double.parseDouble(lector.nextLine());
		System.out.println("¿Cuántos KM te marca el cuentakilómetros");
		kmCuentakilometrosPrincipio = Double.parseDouble(lector.nextLine());

		//Se sacan los litros repostados del primer repostaje.
		litrosRepostadosPrimera = totalPagadoPrimera / precioLitro;
		//Se saca el resultado por pantalla.
		System.out.println("Has repostado " + litrosRepostadosPrimera + " litros en el primer repostaje.");

		//Se piden los datos del segundo repostaje y se guarda en las variables correspondientes.
		System.out.println("¿Cuánto cuesta el litro de combustible en el segundo repostaje?");
		precioLitro = Double.parseDouble(lector.nextLine());
		System.out.println("¿Cuánto has pagado por el segundo repostaje");
		totalPagadoSegunda = Double.parseDouble(lector.nextLine());

		//Se sacan los litros repostados del segundo repostaje.
		litrosRepostadosSegunda = totalPagadoSegunda / precioLitro;
		//Se saca el resultado por pantalla.
		System.out.println("Has repostado " + litrosRepostadosSegunda + " litros en el segundo repostaje.");
		System.out.println("¿Cuántos KM te marca el cuentakilómetros");
		kmCuentakilometrosFinal = Double.parseDouble(lector.nextLine());

		//Operaciones para sacar los valores que nos hacen falta.
		kmRecorridos = kmCuentakilometrosFinal - kmCuentakilometrosPrincipio;
		totalLitros = litrosRepostadosPrimera + litrosRepostadosSegunda;
		consumoMedio = totalLitros * 100 / kmRecorridos;
		totalPagado = totalPagadoPrimera + totalPagadoSegunda;
		costeKilometro = totalPagado / kmRecorridos;
		
		System.out.println("Has recorrido " + kmRecorridos + " KM, desde tu primer repostaje");
		System.out.println("El consumo medio cada 100 KM son " + consumoMedio + " litros.");
		System.out.println("El coste para cada kilometro son " + costeKilometro + " euros.");
		
		lector.close();
	}
}