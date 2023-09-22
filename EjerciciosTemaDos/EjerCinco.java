public class EjerCinco {
	public static void main(String[]args){
	//Declaración de las variables
	int alto = 15;
	int ancho = 25;
	//Se calculan las formulas dadas y se guarda el resultado en la variable.
	int perimetro = 2*(ancho+alto);
	int area = alto*ancho;
	
	//Se muestran los resultados por pantalla.
	System.out.println("El valor dado para el alto del rectangulo son " + alto + "cm " + " y el ancho del rectangulo son " + ancho + "cm "); 
	System.out.println("El Perímetro del rectangulo es: " + perimetro + "cm");
	System.out.println("El área del rectangulo es: " + area + "cm");
	}
}