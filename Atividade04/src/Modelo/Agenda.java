package Modelo;

/**
 *@author Jussara Teixeira
 * 
 * QUESTÃO 04 ___________________________________________________________________________________________________
 * 4. No projeto agenda telefônica crie um pacote modelo e outro pacote chamado visao. 
 * No pacote modelo deverá conter a classe Agenda. 
 * No pacote modelo criar a classe Contato com o atributo tipo(para identificar se é um telefone ou celular) e um
 * atributo chamado numero. Implemente os métodos getter and setter e um método para imprimir os dados do contato. 
 * No pacote visão colocar a classe Principal que será responsável por executar o nosso programa.
 _________________________________________________________________________________________________________________
 */
public class Agenda {
    private String nome;
    private String telefone;

    // Construtor
    public Agenda(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // Método para imprimir os dados da agenda
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}