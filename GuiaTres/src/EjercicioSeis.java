import java.util.Scanner;

public class EjercicioSeis {
	public static void main(String[]arg) {
		Scanner entrada= new Scanner(System.in);
		
		int numero;
		
		System.out.print("Ingrese un numero para imprimir el nombre de la estacion correspondiente: ");
		
		numero=entrada.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Invierno");
			break;
		case 2:
			System.out.println("Verano");
			break;
		case 3:
			System.out.println("Otoño");
			break;
		case 4:
			System.out.println("Primavera");
			break;
		default:
			System.out.println("No es una estacion");
			break;
		}
	}
}
