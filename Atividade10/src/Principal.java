
/**
 *
 * @author Jussara Teixeira
 */
public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10, 2);

        // Testando a soma com doisvalores como parâmetro
        calculadora.somar(6, 3);
        System.out.println("Resultado da soma: " + calculadora.getResultado());

        // Testando a divisão
        calculadora.dividir();
        System.out.println("Resultado da divisão: " + calculadora.getResultado());

        // Testando a multiplicação
        int resultadoMultiplicacao = calculadora.multiplicar(3, 5);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        // Testando a subtração
        calculadora.subtrair();
        System.out.println("Resultado da subtração: " + calculadora.getResultado());
    }
}