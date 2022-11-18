import javax.swing.JOptionPane;

public class ValorInternet {

	public static void main (String [] args) {

		Calculadora c = new Calculadora();
		int velocidade;
		double valorInternet;

		//O valor da internet é igual a sua velocidade - 2.7%
		velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade da internet"));
		valorInternet = velocidade - (c.porcentagem(velocidade, 2.7));
		JOptionPane.showMessageDialog(null,"O valor da internet será de: R$"+valorInternet);

	}

}