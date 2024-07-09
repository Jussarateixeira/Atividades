/**
 *****************************
 * @author Jussara Teixeira
 * ***************************
 */ 
public class Principal {
    public static void main (String[] args) {
        Produto p1 = new Produto("Caneta Bic",4,20);
        System.out.println("Produto: " + p1.getNomeDoProduto());
        System.out.println("Valor Total: " + p1.valorTotal());
        System.out.println("Valor com desconto: " + p1.valorDesconto());
    }
}

