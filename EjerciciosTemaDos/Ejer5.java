import java.util.Scanner;
public class Ejer5 {
	public static void main(String[]args){
	//Declaración de las variables
	Scanner lector = new Scanner(System.in);
	double alto = 0;
	double ancho = 0;
	
	//Se pide el ancho por consola y se guarda en la variable ancho.
	System.out.println("Dime el ancho del rectangulo");
	ancho = Double.parseDouble(lector.nextLine());
	
	//Se pide el alto por consola y se guarda en la variable alto.
	System.out.println("Dime el alto del rectangulo");
	alto = Double.parseDouble(lector.nextLine());

	lector.close();	//Se cierra el Scanner.

	//Se calculan las formulas dadas y se guarda el resultado en la variable.
	double perimetro = ancho * 2 + alto * 2;
	double area = alto*ancho;

	//Se muestran los resultados por pantalla.
	System.out.println("El valor dado para el alto del rectangulo son " + alto + "cm " + " y el ancho del rectangulo son " + ancho + "cm "); 
	System.out.println("El perímetro del rectangulo son: " + perimetro + "cm");
	System.out.println("El área del rectangulo son: " + area + "cm");
	}
}