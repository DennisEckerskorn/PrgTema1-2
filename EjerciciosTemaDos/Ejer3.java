public class Ejer3 {
	public static void main (String[]args) {
		//Declaración de las variables.
		float precioZapato = 85f;
		float descuento = 15f;
		float resultadoDescuento;
		float resultadoFinal;

		//Se calcula el descuento del precio del zapato.
		resultadoDescuento = precioZapato * descuento / 100;

		//Se resta el descuento al precio del zapato.
		resultadoFinal = precioZapato - resultadoDescuento;

		
		//Se imprime el resultado por la consola.

		System.out.println("El precio del zapato con el 15% aplicado son " + resultadoFinal + " euros");
	}
}