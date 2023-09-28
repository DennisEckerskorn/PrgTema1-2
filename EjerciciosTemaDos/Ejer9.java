public class Ejer9 {
	//Declaramos la variable de tipo de referencia enum con varios colores.
	public enum Color{
		RED, GREEN, BLUE
	}
	public static void main(String[] args){
		//Declaramos la variable color de tipo Color(enum).
		Color color;

		//Asignamos y elegimos el valor del enum a la variable color.
		color = Color.RED;
		//Mostramos el valor asignado a la variable en la pantalla.
		System.out.println(color);
		
		color = Color.GREEN;
		System.out.println(color);

		color = Color.BLUE;
		System.out.println(color);
	}
}