import java.util.Scanner;

public class EjerOnce {
	public static void main(String[] args){
		//Declaramos las variables necesarias.
		Scanner lector = new Scanner(System.in);
		double num1, num2, resultado;

		//Pedimos los numeros por pantalla.
		System.out.println("Dime el primer numero para la resta");
		num1 = Double.parseDouble(lector.nextLine());
		System.out.println("Dime el segundo numero para la resta");
		num2 = Double.parseDouble(lector.nextLine());

		//Asignamos el resultado de la operacion a la variable resultado.
		resultado = num1 - num2;

		//Imprimios el resultado por pantalla.
		System.out.println("La resta de " + num1 + " y "+ num2 + " es " + resultado);
		
	}
}
