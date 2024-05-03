import java.io.IOException;
import java.util.Scanner;

public class EjercicioDos {
	public static void main(String []arg) throws IOException {
		Scanner entrada = new Scanner(System.in);
		int num1;
		System.out.print("Digite el primer valor a sumar: ");
		num1=entrada.nextInt();
		int num2;
		System.out.print("Digite el segundo valor a sumar: ");
		num2=entrada.nextInt();
		
		int result = num1+num2;
		System.out.println("La suma entre los dos valores ingresados es: "+result);
	}
}
