import javax.swing.JOptionPane;

public class EjercicioDos {
	public static void main(String[]arg) {
			
		String input = JOptionPane.showInputDialog(null, "Ingrese el precio de su compra: ");
		double precioCompra = Double.parseDouble(input);

		
		double descuento = precioCompra*0.1;
			
		double precioFinal = precioCompra - descuento;		
			
		if (precioCompra > 50.000) {	
			JOptionPane.showMessageDialog(null,"Su precio con descuento es: " + precioFinal);
		}else {
				JOptionPane.showMessageDialog(null, "Su precio no cumple con los requisitos del descuento.");
			}	
			
		}
}
