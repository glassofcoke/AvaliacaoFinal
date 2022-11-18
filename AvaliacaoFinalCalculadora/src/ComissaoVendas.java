

	import javax.swing.JOptionPane;

	public class ComissaoVendas {

		public static void main(String[] args) {

			Calculadora c = new Calculadora();
			double valorVenda, comissao;

			valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da venda"));

			/*
			 * O valor da comissão seguirá a seguinte tabela: 
			 * Vendas até R$1000,00:comissão de 5%
			 * Vendas de R$1000,00 até R$2500,00: comissão de 10% 
			 * Vendas acima de R$2500,00: comissão de 15%
			 */

			if (valorVenda <= 0) {
				JOptionPane.showMessageDialog(null, "Digite um valor acima de 0,00!");
			} else if ((valorVenda > 0) && (valorVenda <= 1000)) {
				comissao = c.porcentagem(valorVenda, 5);
				JOptionPane.showMessageDialog(null,
						"O valor da venda foi de: R$" + valorVenda + "\n O valor da comissão foi de: R$" + comissao);

			} else if ((valorVenda > 1000) && (valorVenda <= 2500)) {
				comissao = c.porcentagem(valorVenda, 10);
				JOptionPane.showMessageDialog(null,
						"O valor da venda foi de: R$" + valorVenda + "\n O valor da comissão foi de: R$" + comissao);
			} else {
				comissao = c.porcentagem(valorVenda, 15);
				JOptionPane.showMessageDialog(null,
						"O valor da venda foi de: R$" + valorVenda + "\n O valor da comissão foi de: R$" + comissao);

			}

		}
	}

