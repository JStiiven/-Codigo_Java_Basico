import java.util.Scanner;

public class EjercicioCinco {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingrese un número: ");
	    int numero = scanner.nextInt();
	        
	    if (numero > 0) {
	            System.out.println("El número es mayor a 0");
	    } else if (numero < 0) {
	    	System.out.println("El número es menor a 0");
	    } else {
	    	System.out.println("El número es igual a 0");
	    }
	}
}
