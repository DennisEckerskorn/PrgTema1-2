public class EjerDiez {
	//Declaramos la variable de tipo de referencia enum.
	public enum Mes {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE	
	}
	public enum NotaMusical {
		DO, RE, MI, FA, SOL, LA, SI
	}
	public enum Calificacion {
		INSUFICIENTE, APROBADO, SUFICIENTE, BIEN, SOBRESALIENTE
	}
	public static void main(String[] args){
		//Inicializamos las variables de tipo enum.
		Mes mes;
		NotaMusical notaMusical;
		Calificacion calificacion;

		//Asignamos el valor de enum a la variable anyo.
		mes = Mes.ENERO;
		//Imprimimos el resultado elegido por pantalla.
		System.out.println(mes);
	
		notaMusical = NotaMusical.DO;
		System.out.println(notaMusical);

		calificacion = Calificacion.SUFICIENTE;
		System.out.println(calificacion);
	}
}