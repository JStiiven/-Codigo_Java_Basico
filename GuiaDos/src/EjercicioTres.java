import java.io.IOException;

import javax.swing.JOptionPane;

public class EjercicioTres {
	public static void main(String []arg) throws IOException{
		String inputUno;
		
		inputUno = JOptionPane.showInputDialog("Ingrese el primer valor a sumar: ");
		int num1 = Integer.parseInt(inputUno);
		
		String inputDos;
		
		inputDos= JOptionPane.showInputDialog("Ingrese el segundo valor a sumar: ");
		int num2 = Integer.parseInt(inputDos);
		
		int result = num1+num2;
		
		JOptionPane.showMessageDialog(null, "El resultado de la suma de los dos valores es: "+result);
	}
}
