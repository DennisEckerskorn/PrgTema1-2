public class EjerDiez {
	//Declaramos la variable de tipo de referencia enum.
	public enum Anyo {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, 			OCTUBRE, NOVIEMBRE, DICIEMBRE	
	}
	public enum Nota{
		DO, RE, MI, FA, SOL, LA, SI
	}
	public enum Calificacion{
		INSUFICIENTE, SUFICIENTE, BIEN, EXCELENTE
	}
	public static void main(String[] args){
		//Inicializamos las variables de tipo enum.
		Anyo anyo;
		Nota nota;
		Calificacion calificacion;

		//Asignamos el valor de enum a la variable anyo.
		anyo = Anyo.ENERO;
		//Imprimimos el resultado elegido por pantalla.
		System.out.println(anyo);
	
		nota = Nota.DO;
		System.out.println(nota);

		calificacion = Calificacion.SUFICIENTE;
		System.out.println(calificacion);
	}
}