import java.io.IOException;
import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int x = scanner.nextInt();

        if (x < 0) {
            x = x * -1;
        }

        System.out.println("El número es: " + x);
    }
}