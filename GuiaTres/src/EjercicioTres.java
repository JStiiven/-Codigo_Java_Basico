import javax.swing.JOptionPane;

public class EjercicioTres {
	public static void  main(String[]arg){
			
		String input = JOptionPane.showInputDialog(null, "Ingrese el primer valor");
		int num1 = Integer.parseInt(input);

		String inputDos = JOptionPane.showInputDialog(null, "Ingrese el segundo valor");
		int num2 = Integer.parseInt(inputDos);
			
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "EL numero mayor es el primer valor: "+num1);
			
		} else if (num1<num2) { 			
			JOptionPane.showMessageDialog(null,"El numero mayor es el segundo valor: "+num2);
			
		} else {		
			JOptionPane.showMessageDialog(null, "Los numeros son iguales");
			}
				
		}
}
