public class Calculadora {
    public double adiçao(double numA, double numB) {
        return numA + numB;
    }

    public double subtraçao(double numA, double numB) {
        return numA - numB;
    }

    public double divisao(double numA, double numB) {
        return numA / numB;
    }

    public double multiplicaçao(double numA, double numB) {
        return numA * numB;
    }

    public double raizQuadrada(double numA) {
        return Math.sqrt(numA);
    }

    public double exponencial(double numA,double numB) {
        return Math.pow(numA,numB);
    }
    public double piso(double numA){

        return Math.floor(numA);
    }
    public double teto(double numB){

        return Math.ceil(numB);
    }
    public double media(double numA, double numB, double numC) {
        return (numA+numB+numC)/3;
    }
    public double porcentagem(double numero, double porcentagem) {
        return(numero*porcentagem)/100;
    }
}
