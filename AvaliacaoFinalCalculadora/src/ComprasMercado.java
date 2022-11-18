

	import javax.swing.JOptionPane;

	public class ComprasMercado {

		public static void main(String[] args) {

			double valorCompras, valorParcelas;
			int quantidadeParcelas;
			Calculadora c = new Calculadora();

			valorCompras = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das compras"));
			quantidadeParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas será a sua compra?"));
			// Caso as compras sejam parceladas em até 3 vezes, não haverá juros, caso seja
			// acima de 3 vezes, haverá um juros de 4,5% em cima da compra

			if (quantidadeParcelas < 1) {
				JOptionPane.showMessageDialog(null, "Digite um valor válido de parcelas");

			} else if (quantidadeParcelas >= 1 && quantidadeParcelas <= 3) {
				valorParcelas = c.divisao(valorCompras, quantidadeParcelas);
				JOptionPane.showMessageDialog(null,
						"O valor da compra total é de: R$" + valorCompras + 
						"\nA quantidade de parcelas é:"+quantidadeParcelas 
						+"\nO valor de cada parcela será: R$" + valorParcelas);
			}

			else {
				valorCompras = valorCompras + c.porcentagem(valorCompras, 4.5);
				valorParcelas = c.divisao(valorCompras, quantidadeParcelas);
				JOptionPane.showMessageDialog(null,
						"O valor da compra total é de: R$" + valorCompras + " (valor total da compra + 4.5% de juros)"+ 
						"\nA quantidade de parcelas é:"+quantidadeParcelas 
						+"\nO valor de cada parcela será: R$" + valorParcelas);
			}

		}
	}

