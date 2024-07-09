/**
 **************************
 * @author Jussara Teixeira
 **************************
 * QUESTÃO 02________________________________________________________________________________
 * 2. Para cada produto informado (nome, preço e quantidade), escreva o nome do produto 
 * comprado e o valor total a ser pago, considerando que são oferecidos descontos pelo número 
 * de unidades compradas, segundo a tabela abaixo: 
 * Até 10 unidades: valor total
 * de 11 a 20 unidades: 10% de desconto
 * de 21 a 50 unidades: 20% de desconto
 * acima de 50 unidades: 25% de desconto
 * ___________________________________________________________________________________________
 */
public class Produto {
    private String nomeDoProduto;
    private double preco;
    private int quantidade;

    public Produto(String nomeDoProduto, double preco, int quantidade) {
        this.nomeDoProduto = nomeDoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotal() {
        return quantidade * preco;
    }
    public double valorDesconto() {
        double resultado;
        if (quantidade <= 10) {
            resultado = valorTotal();
        } else if (quantidade > 10 && quantidade <= 20) {
            resultado = valorTotal() - (valorTotal() * 0.10);
        } else if (quantidade > 20 && quantidade <= 50) {
            resultado = valorTotal() - (valorTotal() * 0.20);
        } else {
            resultado = valorTotal() - (valorTotal() * 0.25);
        }
        return resultado;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}