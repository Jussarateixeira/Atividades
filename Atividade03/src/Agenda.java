/**
 *
 **************************
 * @author Jussara Teixeira
 *************************
 * QUESTÃO 03______________________________________________________________________________
 * 3. Faça um projeto chamado agenda telefônica, representado pela classe Agenda.
 * Implemente os métodos getter and setter e um método para imprimir os dados da agenda. 
 * Criar uma classe principal com o método principal para instanciar objetos do tipo Agenda.
 ___________________________________________________________________________________________
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
