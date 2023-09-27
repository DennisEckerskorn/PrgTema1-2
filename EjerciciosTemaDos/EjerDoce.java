import java.util.Scanner;

public class EjerDoce {
	public static void main(String[] args){
		//Declaramos las variables necesarias.
		Scanner lector = new Scanner(System.in);
		double num1, num2, resultado;

		//Pedimos los numeros por pantalla.
		System.out.println("Dime el primer numero");
		num1 = Double.parseDouble(lector.nextLine());
		System.out.println("Dime el segundo numero");
		num2 = Double.parseDouble(lector.nextLine());

		//Asignamos el resultado de la operacion a la variable resultado.
		resultado = num1 / num2;

		//Imprimios el resultado por pantalla.
		System.out.println(num1 + " / " + num2 + " = " + resultado);
	}
}