public class EjerCuatro {
	public static void main(String[]args) {
		//Declaracion Variables.
		int resultadoA;
		int resultadoB;
		int resultadoC;
		int resultadoD;
		
		//Operaciones que se guardan en las variables
		resultadoA = 25 + 20 - 15;
		resultadoB = 20 * 10 +15 * 10;
		resultadoC = 20 * 10 / 2 - 20 / 5 * 3;
		resultadoD = 15 / 10 * 2 + 3 / 4 * 8; 
		
		//Mostramos los valores en pantalla.
		System.out.println("25+20-15 = " + resultadoA);
		System.out.println("20*10+15*10 = " + resultadoB);
		System.out.println("20*10/2-20/5*3 = " + resultadoC);
		System.out.println("15/10*2+3/4*8 = " + resultadoD);
		
		//Resultados calculados con calculadora.
		System.out.println("Los resultados reales son: 30, 350, 88, 9");
	}
}