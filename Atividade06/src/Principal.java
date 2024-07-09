
/**
 *
 * @author Jussara Teixeira
 */
// Método principal para testar a funcionalidade do sistema de locação
    public static void main(String[] args) {
        // Criação de objetos da classe Filmes
        Filmes filme1 = new Filmes("O Auto da Compadecida 2", "lançamento");
        Filmes filme2 = new Filmes("Sherlock Holmes", "promoção");
        Filmes filme3 = new Filmes("Os Croods", "infantil");

        // Cálculo do preço  e exibição dos resultados
        System.out.println("Valor do filme: " + filme1.titulo + ": R$ " + filme1.calcularPreco());
        System.out.println("Valor do filme: " + filme2.titulo + ": R$ " + filme2.calcularPreco());
        System.out.println("Valor do filme: " + filme3.titulo + ": R$ " + filme3.calcularPreco());
    }
