
/**
 *@author Jussara Teixeira
 ***************************
 * QUESTÃO 06___________________________________________________________________________________
 * 6) Crie um programa para um sistema de locação de filmes digitais. O sistema possui
 * filmes nas categorias: lançamento, promoção e infantil. Para calcular o preço da locação e
 * construir as entidades apresentadas, crie métodos e utilize como regra as definições a seguir:
 * Filmes de um modo geral possui um valor normal de locação de R$ 4,00;
 * Filmes infantis possui um valor normal de locação + acréscimo de R$ 2,00;
 * Filmes em Lançamento possui um valor normal de locação + acréscimo de R$ 3,00;
 * Filmes em promoção possuem um valor normal de locação + desconto de R$ 2,00.
 ________________________________________________________________________________________________
 */
public class Filmes {
   
    public String titulo;
    public String categoria;
    
// Construtor da classe Filmes
    public Filmes(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    // Método para calcular o preço da locação baseado na categoria
    public double calcularPreco() {
        double precoAlocacao = 4;
        switch (categoria) {
            case "lançamento":
                precoAlocacao += 3;
                break;
            case "promoção":
                precoAlocacao += 2;
                break;
            case "infantil":
                precoAlocacao += 2;
                break;
            default:
                System.out.println("CATEGORIA INVÁLIDA!");
                break;
        }
        return precoAlocacao;
    }
}
 