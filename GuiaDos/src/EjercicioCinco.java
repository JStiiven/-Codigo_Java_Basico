import javax.swing.JOptionPane;

public class EjercicioCinco {
	public static void main(String []arg) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para 1:"));
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para 2:"));
		
        int c = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para 3:"));
        
        int d = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para 4:"));
        
        int e = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para 5:"));
        
        int f = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para 6:"));
        
        int g = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para 7:"));
        
        int h = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para 8:"));
        
        int i = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para 9:"));

     
        int result = ((a / b) + c - d + (e * f * 1) - (g / 2) + h - (i * 4));
        
 
        JOptionPane.showMessageDialog(null, "El resultado es: " + result);
	}

}
