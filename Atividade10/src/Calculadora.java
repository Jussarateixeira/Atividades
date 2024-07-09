
/**
 *
 * @author Jussara Teixeira
 *  * QUESTÃO 10________________________________________________________________________________________________
 10. Crie uma classe calculadora simples que tenha os atributos: numero1, numero2 e resultado.
 Implemente os métodos para somar, dividir, multiplicar, subtrair da seguinte forma:
 * O método somar tem que receber dois parâmetros;
 * O método dividir não recebe parâmetros;
 * O método multiplicar retorna a multiplicação de dois argumentos;
 * O método subtrair fica a sua escolha.
 Implemente a classe principal para que você possa realizar os testes.
 ___________________________________________________________________________________________________
 */
public class Calculadora {
    private int numeroUm;
    private int numeroDois;
    private int resultado;

    public Calculadora(int numeroUm, int numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public void somar(int numeroUm, int numeroDois) {
        resultado = numeroUm + numeroDois;
    }

    public void dividir() {
        
        resultado = numeroUm / numeroDois;
        
    }

    public int multiplicar(int numeroUm, int numeroDois) {
        return numeroUm * numeroDois;
    }

    public void subtrair() {
        resultado = numeroUm - numeroDois;
    }

    public int getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "numeroUm=" + numeroUm + ", numeroDois=" + numeroDois + ", resultado=" + resultado + '}';
    }
}

