import javax.swing.JOptionPane;

public class ServicoStreaming {

	public static void main(String[] args) {

		int qualidadeStreaming;
		double valorFinalStreaming, valorBaseStreaming;
		Calculadora c = new Calculadora();

		JOptionPane.showMessageDialog(null, "Programa para calcular preço final de um serviço de Streaming. ");
		qualidadeStreaming = Integer.parseInt(JOptionPane.showInputDialog("Selecione o plano do Streaming" + "\n 1 - Standard" + "\n 2 - Premium" + "\n 3 - Deluxe"));

		/*
		 * Se a qualidade for "Standard", o valor do plano é valor base + 5%, caso seja
		 * "Premium", o valor do plano será valor base + 15% e caso seja "Deluxe", o
		 * valor do plano será valor base +25%
		 */

		if (qualidadeStreaming >= 1 && qualidadeStreaming <= 3) {
			valorBaseStreaming = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor base do serviço de Streaming"));
			if (qualidadeStreaming == 1) {
				valorFinalStreaming = valorBaseStreaming + c.porcentagem(valorBaseStreaming, 5);
				JOptionPane.showMessageDialog(null, "O valor final do serviço é de: R$" + valorFinalStreaming);

			} else if (qualidadeStreaming == 2) {
				valorFinalStreaming = valorBaseStreaming + c.porcentagem(valorBaseStreaming, 15);
				JOptionPane.showMessageDialog(null, "O valor final do serviço é de: R$" + valorFinalStreaming);

			} else if (qualidadeStreaming == 3) {
				valorFinalStreaming = valorBaseStreaming + c.porcentagem(valorBaseStreaming, 25);
				JOptionPane.showMessageDialog(null, "O valor final do serviço é de: R$" + valorFinalStreaming);
			} 
			}
		else {
			JOptionPane.showMessageDialog(null, "Selecione um plano válido!");

	}
		}
}
