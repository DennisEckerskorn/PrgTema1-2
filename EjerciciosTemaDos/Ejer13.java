import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {
		//Declaramos las variables del programa.
		Scanner lector = new Scanner(System.in);
		int segundos, segundosUsuario, minutos, horas, dias;

		//Pedimos los segundos al usuario por consola.
		System.out.println("Ingresa una cantidad de segundos");
		segundos = Integer.parseInt(lector.nextLine());
		segundosUsuario = segundos;

		//Operaciones para convertir los segundos a minutos, horas y dias.
		minutos = segundos / 60;
		segundos = segundos % 60;
		//Los segundos ya estan calculado correctamente.
		horas = minutos / 60;
		minutos = minutos % 60;
		//Los minutos ya estan calculado correctamente.
		dias = horas / 24;
		horas = horas % 24;
		//Las horas ya estan calculado correctamente.
		//El resto que queda son dias.

		//Sacamos los resultados por pantalla, mostrando los segundos ingresados y los resultados calculados.
		System.out.println(segundosUsuario + " segundos son " + dias + " días, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
		//Cerramos el Scanner.
		lector.close();		
	}
}