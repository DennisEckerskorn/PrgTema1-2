import java.util.Scanner;
public class PruebaSwitch{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int nota;
		
		do{
			System.out.println("Indica una nota");
			nota = Integer.parseInt(lector.nextLine());
		
			switch(nota) {
				case 0:
					System.out.println("M.D");
					break;
				case 1:
					System.out.println("INS");
					break;
				case 2:
					System.out.println("SUF");
					break;
				case 3:
					System.out.println("BIEN");
					break;
				case 4:
					System.out.println("NOT");
					break;
				case 5:
					System.out.println("SOB");
					break;
				default:
					System.out.println("El numero introducido no es válido, prueba de nuevo");
			}
		}while(nota>=5);
	}
}