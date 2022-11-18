
    import javax.swing.JOptionPane;

    public class IMC {
    
        public static void main(String[] args) {
    
            double peso, altura, IMC;
            Calculadora c = new Calculadora();
    
            JOptionPane.showMessageDialog(null, "Programa para calcular IMC(Índice de massa corporal). ");
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
            IMC = c.divisao(peso, c.exponencial(altura, altura));
            JOptionPane.showMessageDialog(null, "O seu IMC é: " + IMC);
    
        }
    }


