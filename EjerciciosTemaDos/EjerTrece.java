import java.util.Scanner;

public class EjerTrece{
	public static void main(String[] args){
		//Declaramos las variables del programa, en este caso Long porque segundos pordrian superar el limite de un Entero.
		Scanner lector = new Scanner(System.in);
		long segundos, minutos, horas, dias;

		//Pedimos los segundos al usuario por consola.
		System.out.println("Ingresa una cantidad de segundos");
		segundos = Long.parseLong(lector.nextLine());
		
		//Operaciones para convertir los segundos a minutos, horas y dias.
		minutos = segundos / 60;
		horas = minutos / 60;
		dias = horas / 24;

		//Sacamos los resultados por pantalla, si el resultado es 1 segundo, 1 minuto o 1 hora se saca un mensaje adecuado por pantalla.
		if (minutos == 1){
			System.out.println(segundos + " segundos es " + minutos + " minuto " + horas + " horas y " + dias + " dias.");
		} else if (horas == 1){
			System.out.println(segundos + " segundos son " + minutos + " minutos " + horas + " hora y " + dias + " dias.");
		}else if (dias == 1){
			System.out.println(segundos + " segundos son " + minutos + " minutos " + horas + " horas y " + dias + " dia.");
		}else{
			System.out.println(segundos + " segundos son " + minutos + " minutos " + horas + " horas y " + dias + " dias.");
		}		
	}
}