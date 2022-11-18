import javax.swing.JOptionPane;

public class SeguroCarro {
	public static void main(String[] args) {

		int tipoCarro;
		Double valorBaseCarro, valorSeguro;
		Calculadora c = new Calculadora();

		tipoCarro = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o tipo do carro" + "\n 1 - Sedan" + "\n 2 - Hatch" + "\n 3 - SUV"));

		/*
		 * Caso o carro seja do tipo sedan, o valor do seguro será 3% do seu valor base
		 * Caso o carro seja do tipo hatch, o valor do seguro será 2% do seu valor base
		 * Caso o carro seja do tipo SUV, o valor do seguro será 6% do seu valor base
		 */

		if ((tipoCarro != 1) && (tipoCarro != 2) && (tipoCarro != 3)) {
			JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
		} else {
            valorBaseCarro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor base do carro."));
			if (tipoCarro == 1) {
				valorSeguro = c.porcentagem(valorBaseCarro, 3);
				JOptionPane.showMessageDialog(null, "O valor do seguro foi cotado em: R$" + valorSeguro);
			} else if (tipoCarro == 2) {
				valorSeguro = c.porcentagem(valorBaseCarro, 2);
				JOptionPane.showMessageDialog(null, "O valor do seguro foi cotado em: R$" + valorSeguro);
			} else if (tipoCarro == 3) {
				valorSeguro = c.porcentagem(valorBaseCarro, 6);
				JOptionPane.showMessageDialog(null, "O valor do seguro foi cotado em: R$" + valorSeguro);
			}

		}
	}
}