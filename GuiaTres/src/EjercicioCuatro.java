import java.util.Scanner;

public class EjercicioCuatro {
	public static void main(String [] arg) {
		Scanner entrada = new Scanner(System.in);
		
		int edad;
		
		System.out.print("Ingrese su edad: ");
		edad=entrada.nextInt();
		if (edad >=18) {
			System.out.println("Usted es Mayor de Edad!!!");
		} else {
			System.out.println("Usted es Menor de Edad!!!");
		}
	}
}
