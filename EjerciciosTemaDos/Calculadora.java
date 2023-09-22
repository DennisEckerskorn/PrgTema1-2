import java.util.Scanner;

public class Calculadora {
	public static void main(String[]args){
		//Declaracion de las variables.
		Scanner lector = new Scanner(System.in);
		double resultado = 0; 
		double numeroUno; 
		double numeroDos;
		char caracter = ' ';
		char operador = ' ';		

		//Menu para elegir el caracter correcto.
		System.out.println("Introduce el caracter correspondiente a la operacion:");
		System.out.println("s. suma");
		System.out.println("r. resta");
		System.out.println("d. division");
		System.out.println("m. multiplicacion");
		
		//Se lee el primer caracter del string introducido por consola y se guarda en la variable caracter.
		caracter = lector.next().charAt(0);
		
		//Se pide el primer numero por pantalla.
		System.out.println("Ingresa el primer numero");
		numeroUno = lector.nextDouble();

		//Se pide el segundo numero por pantalla.
		System.out.println("Ingresa el segundo numero");
		numeroDos = lector.nextDouble();
		
		//If anidados que segun el caracter introducido realiza la operacion.
		if(caracter == 's' ){
			resultado = numeroUno + numeroDos;
			operador = '+';
		}
		else if (caracter == 'r'){
			resultado = numeroUno - numeroDos;
			operador = '-';
		}
		else if (caracter == 'd'){
			resultado = numeroUno / numeroDos;
			operador = '*';
		}
		else if (caracter == 'm'){
			resultado = numeroUno * numeroDos;
			operador = '/';	
		}
		else{
			System.out.println("El caracter introducido es erroneo");
		}

		if (operador != ' '){
			System.out.println(numeroUno + " " + operador + " " + numeroDos + " = " + resultado);
		}		
	}
}