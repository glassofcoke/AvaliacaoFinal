import javax.swing.JOptionPane;

public class AreaRetangulo {

	public static void main(String [] args) {
		
		double base, altura, area;
		Calculadora c = new Calculadora();
		
		JOptionPane.showMessageDialog(null, "Programa para calcular a área de um retângulo.");
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite base do retângulo"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo"));
		area = c.multiplicaçao(base, altura);
		JOptionPane.showMessageDialog(null, "A base do retângulo é:"+base+" e a sua altura é: "+altura+". A área do retângulo é "+area);
		
		
		
		
		
	}
}