import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del empleado: ");
        double sueldo = scanner.nextDouble();

        double porcentaje = sueldo * 0.3;

        double pagoTotal = sueldo + porcentaje;

        System.out.println("El sueldo final del empleado es: " + pagoTotal);
    }
}