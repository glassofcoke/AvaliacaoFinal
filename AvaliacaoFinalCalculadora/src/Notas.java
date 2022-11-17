import javax.swing.JOptionPane;

public class Notas {

public static void main(String [] args) {
	
	String nomeAluno; 
	Double mediaAluno, notaUm, notaDois, notaTres;
	Calculadora c = new Calculadora();
	
	nomeAluno = (JOptionPane.showInputDialog("Digite o nome do Aluno"));
	notaUm = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota de "+nomeAluno));
	notaDois = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota de "+nomeAluno));
	notaTres = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota de "+nomeAluno));
	mediaAluno = c.media(notaUm, notaDois, notaTres);
	JOptionPane.showMessageDialog(null, "O aluno "+nomeAluno+" , teve as seguintes notas:"
			+ "\n Primeira nota: "+notaUm
			+ "\n Segunda nota: "+notaDois
			+ "\n Terceira nota: "+notaTres
			+ "\n A sua média foi: "+mediaAluno);
	
	
	
	
	
	
}
}