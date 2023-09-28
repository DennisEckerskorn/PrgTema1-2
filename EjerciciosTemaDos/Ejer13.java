import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {
		//Declaramos las variables del programa, en este caso Long porque segundos pordrian superar el limite de un Entero.
		Scanner lector = new Scanner(System.in);
		int segundos, segundosUsuario, minutos, horas, dias;

		//Pedimos los segundos al usuario por consola.
		System.out.println("Ingresa una cantidad de segundos");
		segundos = Integer.parseInt(lector.nextLine());
		segundosUsuario = segundos;
		//Operaciones para convertir los segundos a minutos, horas y dias.
		minutos = segundos / 60;
		segundos = segundos % 60;
		//Los segundos estan ya estan calculado correctamente.
		horas = minutos / 60;
		minutos = minutos % 60;
		//Los minutos estan ya estan calculado correctamente.
		dias = horas / 24;
		horas = horas % 24;
		//Las horas estan ya estan calculado correctamente.
		//El resto que queda son dias.

		//Sacamos los resultados por pantalla, si el resultado es 1 segundo, 1 minuto o 1 hora se saca un mensaje adecuado por pantalla.
		if (minutos == 1){
			System.out.println(segundosUsuario + " segundos es " + minutos + " minuto " + horas + " horas y " + dias + " dias.");
		} else if (horas == 1){
			System.out.println(segundosUsuario + " segundos son " + minutos + " minutos " + horas + " hora y " + dias + " dias.");
		}else if (dias == 1){
			System.out.println(segundosUsuario + " segundos son " + minutos + " minutos " + horas + " horas y " + dias + " dia.");
		}else{
			System.out.println(segundosUsuario + " segundos son " + minutos + " minutos " + horas + " horas y " + dias + " dias.");
		}
		//Cerramos el Scanner.
		lector.close();		
	}
}